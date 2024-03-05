package Application.Model.DataRetrieval;

import Application.Exception.Application.Service.DataRetrieval.PhoneNumberRetrievalError;
import Application.Exception.Application.ViewException;
import Application.Model.DataRetrievalService;
import Application.View.View;

import java.util.List;

/**
 * Сервис для получения номера телефона пользователя.
 * Реализует функционал класса {@link DataRetrievalService}.
 */
public class PhoneNumberRetrieval extends DataRetrievalService {

    /**
     * Возвращает текст запроса для получения номера телефона пользователя.
     *
     * @return текст запроса для получения номера телефона пользователя.
     */
    @Override
    protected String getRequestText() {
        return """
                Введите ваш номер телефона:
                >>>\s""";
    }

    /**
     * Запускает процесс получения номера телефона пользователя.
     *
     * @param data список данных, в который будет записан номер телефона пользователя.
     * @throws PhoneNumberRetrievalError если произошла ошибка при получении номера телефона пользователя.
     */
    @Override
    public void start(List<String> data) throws PhoneNumberRetrievalError {
        this.setData(data);
        View view = this.getView();
        try {
            view.request(getRequestText());
            data.set(4, view.response().trim());
        } catch (ViewException exception) {
            throw new PhoneNumberRetrievalError(exception);
        }
    }

}
