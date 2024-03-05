package Application.Model.DataRetrieval;

import Application.Exception.Application.Service.DataRetrieval.SurnameRetrievalError;
import Application.Exception.Application.ViewException;
import Application.Model.DataRetrievalService;
import Application.View.View;

import java.util.List;

/**
 * Сервис для получения фамилии пользователя.
 * Реализует функционал класса {@link DataRetrievalService}.
 */
public class SurnameRetrieval extends DataRetrievalService {

    /**
     * Возвращает текст запроса для получения фамилии пользователя.
     *
     * @return текст запроса для получения фамилии пользователя.
     */
    @Override
    protected String getRequestText() {
        return """
                Введите вашу фамилию:
                >>>\s""";
    }

    /**
     * Запускает процесс получения фамилии пользователя.
     *
     * @param data список данных, в который будет записана фамилия пользователя.
     * @throws SurnameRetrievalError если произошла ошибка при получении фамилии пользователя.
     */
    @Override
    public void start(List<String> data) throws SurnameRetrievalError {
        this.setData(data);
        View view = this.getView();
        try {
            view.request(getRequestText());
            data.set(0, view.response().trim());
        } catch (ViewException exception) {
            throw new SurnameRetrievalError(exception);
        }
    }

}
