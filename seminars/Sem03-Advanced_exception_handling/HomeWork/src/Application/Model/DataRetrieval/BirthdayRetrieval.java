package Application.Model.DataRetrieval;

import Application.Exception.Application.Service.DataRetrieval.BirthdayRetrievalError;
import Application.Exception.Application.ViewException;
import Application.Model.DataRetrievalService;
import Application.View.View;

import java.util.List;

/**
 * Сервис для получения даты рождения пользователя.
 * Реализует функционал класса {@link DataRetrievalService}.
 */
public class BirthdayRetrieval extends DataRetrievalService {

    /**
     * Возвращает текст запроса для получения даты рождения пользователя.
     *
     * @return текст запроса для получения даты рождения пользователя.
     */
    @Override
    protected String getRequestText() {
        return """
                Введите вашу дату рождения:
                >>>\s""";
    }

    /**
     * Запускает процесс получения даты рождения пользователя.
     *
     * @param data список данных, в который будет записана дата рождения пользователя.
     * @throws BirthdayRetrievalError если произошла ошибка при получении даты рождения пользователя.
     */
    @Override
    public void start(List<String> data) throws BirthdayRetrievalError {
        this.setData(data);
        View view = this.getView();
        try {
            view.request(getRequestText());
            data.set(3, view.response().trim());
        } catch (ViewException exception) {
            throw new BirthdayRetrievalError(exception);
        }
    }

}
