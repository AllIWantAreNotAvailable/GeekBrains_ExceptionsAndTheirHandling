package Application.Exception.Application.Service.DataRetrieval;

import Application.Exception.Application.Service.DataRetrievalException;

/**
 * Исключение, выбрасываемое при возникновении ошибки при получении имени пользователя.
 */
public class NameRetrievalError extends DataRetrievalException {

    /**
     * Создает новое исключение с сообщением об ошибке получения имени пользователя.
     *
     * @param cause Причина исключения.
     */
    public NameRetrievalError(Exception cause) {
        super("Ошибка получения имени пользователя:", cause);
    }

}
