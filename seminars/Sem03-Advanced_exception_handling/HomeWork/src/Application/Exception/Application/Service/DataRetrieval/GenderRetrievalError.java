package Application.Exception.Application.Service.DataRetrieval;

import Application.Exception.Application.Service.DataRetrievalException;

/**
 * Исключение, выбрасываемое при возникновении ошибки при получении пола пользователя.
 */
public class GenderRetrievalError extends DataRetrievalException {

    /**
     * Создает новое исключение с сообщением об ошибке получения пола пользователя.
     *
     * @param cause Причина исключения.
     */
    public GenderRetrievalError(Exception cause) {
        super("Ошибка получения пола пользователя:", cause);
    }

}
