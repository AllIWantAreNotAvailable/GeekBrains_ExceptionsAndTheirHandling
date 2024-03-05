package Application.Model.DataRetrieval;

import Application.Exception.Application.Service.DataRetrieval.NameRetrievalError;
import Application.Exception.Application.ViewException;
import Application.Model.DataRetrievalService;
import Application.View.View;

import java.util.List;

/**
 * Сервис для получения имени пользователя.
 * Реализует функционал класса {@link DataRetrievalService}.
 */
public class NameRetrieval extends DataRetrievalService {


    /**
     * Возвращает текст запроса для получения имени пользователя.
     *
     * @return текст запроса для получения имени пользователя.
     */
    @Override
    protected String getRequestText() {
        return """
                Введите ваше имя:
                >>>\s""";
    }

    /**
     * Запускает процесс получения имени пользователя.
     *
     * @param data список данных, в который будет записано имя пользователя.
     * @throws NameRetrievalError если произошла ошибка при получении имени пользователя.
     */
    @Override
    public void start(List<String> data) throws NameRetrievalError {
        this.setData(data);
        View view = this.getView();
        try {
            view.request(getRequestText());
            data.set(1, view.response().trim());
        } catch (ViewException exception) {
            throw new NameRetrievalError(exception);
        }
    }

}
