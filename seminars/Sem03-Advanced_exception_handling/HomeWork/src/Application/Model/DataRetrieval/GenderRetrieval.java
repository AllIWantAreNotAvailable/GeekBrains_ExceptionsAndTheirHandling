package Application.Model.DataRetrieval;

import Application.Exception.Application.Service.DataRetrieval.GenderRetrievalError;
import Application.Exception.Application.ViewException;
import Application.Model.DataRetrievalService;
import Application.View.View;

import java.util.List;

/**
 * Сервис для получения пола пользователя.
 * Реализует функционал класса {@link DataRetrievalService}.
 */
public class GenderRetrieval extends DataRetrievalService {

    /**
     * Возвращает текст запроса для получения пола пользователя.
     *
     * @return текст запроса для получения пола пользователя.
     */
    @Override
    protected String getRequestText() {
        return """
                Введите ваш пол:
                >>>\s""";
    }

    /**
     * Запускает процесс получения пола пользователя.
     *
     * @param data список данных, в который будет записан пол пользователя.
     * @throws GenderRetrievalError если произошла ошибка при получении пола пользователя.
     */
    @Override
    public void start(List<String> data) throws GenderRetrievalError {
        this.setData(data);
        View view = this.getView();
        try {
            view.request(getRequestText());
            data.set(5, view.response().trim());
        } catch (ViewException exception) {
            throw new GenderRetrievalError(exception);
        }
    }

}
