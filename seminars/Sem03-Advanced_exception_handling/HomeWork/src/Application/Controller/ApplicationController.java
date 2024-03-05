package Application.Controller;

import Application.Exception.Application.Service.DataValidation.*;
import Application.Exception.Application.Service.DataValidationException;
import Application.Exception.Application.ViewException;
import Application.Exception.ApplicationException;
import Application.Model.*;
import Application.Model.DataRetrieval.*;
import Application.View.View;

import java.util.*;

public class ApplicationController extends BaseController implements Application {

    private List<String> data;
    private View view;
    private Deque<Service> stack;
    private List<AutoCloseable> toClose;

    public ApplicationController(List<String> data) {
        this.setData(data);
        this.setView(new ViewController());
        this.setStack(new ArrayDeque<>());
        this.setToClose(new ArrayList<>());
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public View getView() {
        return this.view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public Deque<Service> getStack() {
        return this.stack;
    }

    public void setStack(Deque<Service> stack) {
        this.stack = stack;
    }

    public List<AutoCloseable> getToClose() {
        return this.toClose;
    }

    public void setToClose(List<AutoCloseable> toClose) {
        this.toClose = toClose;
    }

    @Override
    public boolean isStartupParameters() {
        List<String> data = this.getData();
        return data != null && !data.isEmpty();
    }

    @Override
    public void run() throws ApplicationException {
        // 1. Получение данных:
        // 1.1. Если не заданы параметры запуска.
        if (!this.isStartupParameters()) {
            // Инициализируем пустой массив данных и добавляем задачу на получение данных от пользователя.
            this.setData(new ArrayList<>());
            this.getStack().push(new DataRetrievalService());
        }
        // 2. Добавляем задачу валидации данных.
        this.getStack().addLast(new DataValidationService());
        // 3. Добавляем задачу записи данных.
        this.getStack().addLast(new DataSaverService());
        // 4. Начинаем выполнять задачи:
        while (!this.getStack().isEmpty()) {
            // Достаем задачу из стека.
            Service service = this.getStack().peek();
            // Пробуем выполнить задачу.
            try {
                assert service != null;
                service.start(this.getData());
            } catch (DataValidationException exception) {
                // Все ошибки валидации обрабатывыем в отдельном обработчике исскключений.
                this.dataValidationExceptionHandler(exception);
                continue;
            } catch (AssertionError error) {
                // AssertionError защищает от NPE. Единсквенный вариант получить NPE - пустой стек, завершаем цикл.
                break;
            } catch (Exception exception) {
                throw new ApplicationException(exception);
            }
            // 5. Если иссключений при выполнении задачи не было вызвано, то считаем ее выполненой, выкидываем из стека.
            service = this.getStack().poll();
            // 6. Если задача использовала какие либо потоки и внешние ресурсы, то добавляем ее к закрытию.
            if (service instanceof AutoCloseable) {
                this.getToClose().add((AutoCloseable) service);
            }
        }
    }

    private void dataValidationExceptionHandler(DataValidationException exception) throws ViewException, DataValidationException {
        this.getView().request(exception.getMessage() + "\nПовторите ввод данных.\n");
        switch (exception) {
            case NotEnoughDataError ignored -> this.getStack().push(new DataRetrievalService());
            case RedundantDataError ignored -> this.getStack().push(new DataRetrievalService());
            case SurnameFormatError ignored -> this.getStack().push(new SurnameRetrieval());
            case NameFormatError ignored -> this.getStack().push(new NameRetrieval());
            case PatronymicFormatError ignored -> this.getStack().push(new PatronymicRetrieval());
            case BirthdayFormatError ignored -> this.getStack().push(new BirthdayRetrieval());
            case PhoneNumberFormatError ignored -> this.getStack().push(new PhoneNumberRetrieval());
            case GenderFormatError ignored -> this.getStack().push(new GenderRetrieval());
            default -> throw new DataValidationException(exception);
        }
    }

    @Override
    public void close() throws ApplicationException {
        ListIterator<AutoCloseable> iterator = this.getToClose().listIterator(toClose.size());
        try {
            this.getView().close();
            while (iterator.hasPrevious()) {
                AutoCloseable closeable = iterator.previous();
                closeable.close();
            }
        } catch (Exception exception) {
            throw new ApplicationException(exception);
        }
    }

}
