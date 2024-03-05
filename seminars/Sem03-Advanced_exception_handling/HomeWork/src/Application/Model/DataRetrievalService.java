package Application.Model;

import Application.Controller.ViewController;
import Application.Exception.Application.Service.DataRetrievalException;
import Application.Exception.Application.ServiceException;
import Application.Exception.Application.ViewException;
import Application.View.View;

import java.util.Collections;
import java.util.List;

/**
 * <p>Сервис для получения данных от пользователя.
 * Реализует функционал интерфейса {@link Service} и {@link AutoCloseable}.
 */
public class DataRetrievalService extends BaseModel implements Service, AutoCloseable {

    private List<String> data;
    private View view;

    /**
     * Создает объект DataRetrievalService с контроллером представления по умолчанию.
     */
    public DataRetrievalService() {
        this.setView(new ViewController());
    }

    /**
     * Возвращает список данных, полученных от пользователя.
     *
     * @return список строк данных пользователя.
     */
    public List<String> getData() {
        return this.data;
    }

    /**
     * Устанавливает список данных, полученных от пользователя.
     *
     * @param data список строк данных пользователя.
     */
    public void setData(List<String> data) {
        this.data = data;
    }

    /**
     * Возвращает объект представления, используемый для взаимодействия с пользователем.
     *
     * @return объект представления.
     */
    public View getView() {
        return this.view;
    }

    /**
     * Устанавливает объект представления, используемый для взаимодействия с пользователем.
     *
     * @param view объект представления.
     */
    public void setView(View view) {
        this.view = view;
    }

    /**
     * Возвращает текст запроса для получения данных от пользователя.
     *
     * @return текст запроса.
     */
    protected String getRequestText() {
        return """
                Введите ваши данные через пробел:
                \t- Фамилия;
                \t- Имя;
                \t- Отчество;
                \t- Дата рождения;
                \t- Номер телефона;
                \t- Пол.
                >>>\s""";
    }

    /**
     * Начинает процесс получения данных от пользователя.
     *
     * @param data список данных пользователя.
     * @throws DataRetrievalException если произошла ошибка при получении данных от пользователя.
     */
    @Override
    public void start(List<String> data) throws DataRetrievalException {

        this.setData(data);
        View view = this.getView();
        try {
            view.request(this.getRequestText());
            data.clear();
            String response = view.response().trim().replaceAll("\\s{2,}", " ");
            Collections.addAll(data, response.split(" "));
        } catch (ViewException exception) {
            throw new DataRetrievalException(exception);
        }

    }

    /**
     * Закрывает поток ввода данных от пользователя.
     *
     * @throws ServiceException если произошла ошибка при закрытии потока ввода данных от пользователя.
     */
    @Override
    public void close() throws ServiceException {
        try {
            this.getView().close();
        } catch (ViewException exception) {
            throw new ServiceException("Ошибка view-слоя при попытке закрытия потока", exception);
        }
    }

}
