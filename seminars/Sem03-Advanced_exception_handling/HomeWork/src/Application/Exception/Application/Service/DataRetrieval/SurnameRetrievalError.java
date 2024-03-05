package Application.Exception.Application.Service.DataRetrieval;

import Application.Exception.Application.Service.DataRetrievalException;

/**
 * Исключение, выбрасываемое при возникновении ошибки при получении фамилии пользователя.
 */
public class SurnameRetrievalError extends DataRetrievalException {

    /**
     * Создает новое исключение с сообщением об ошибке получения фамилии пользователя.
     *
     * @param cause Причина исключения.
     */
    public SurnameRetrievalError(Exception cause) {
        super("Ошибка получения фамилии пользователя:", cause);
    }

}
