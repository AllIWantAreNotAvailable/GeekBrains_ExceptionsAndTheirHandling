package Application.Model.DataRetrieval;

import Application.Exception.Application.Service.DataRetrieval.PatronymicRetrievalError;
import Application.Exception.Application.ViewException;
import Application.Model.DataRetrievalService;
import Application.View.View;

import java.util.List;

/**
 * Сервис для получения отчества пользователя.
 * Реализует функционал класса {@link DataRetrievalService}.
 */
public class PatronymicRetrieval extends DataRetrievalService {

    /**
     * Возвращает текст запроса для получения отчества пользователя.
     *
     * @return текст запроса для получения отчества пользователя.
     */
    @Override
    protected String getRequestText() {
        return """
                Введите ваше отчество:
                >>>\s""";
    }

    /**
     * Запускает процесс получения отчества пользователя.
     *
     * @param data список данных, в который будет записано отчество пользователя.
     * @throws PatronymicRetrievalError если произошла ошибка при получении отчества пользователя.
     */
    @Override
    public void start(List<String> data) throws PatronymicRetrievalError {
        this.setData(data);
        View view = this.getView();
        try {
            view.request(getRequestText());
            data.set(2, view.response().trim());
        } catch (ViewException exception) {
            throw new PatronymicRetrievalError(exception);
        }
    }

}
