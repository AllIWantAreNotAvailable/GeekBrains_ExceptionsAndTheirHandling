package Application.Exception.Application.Service.DataRetrieval;

import Application.Exception.Application.Service.DataRetrievalException;

/**
 * Исключение, выбрасываемое при возникновении ошибки при получении отчества пользователя.
 */
public class PatronymicRetrievalError extends DataRetrievalException {

    /**
     * Создает новое исключение с сообщением об ошибке получения отчества пользователя.
     *
     * @param cause Причина исключения.
     */
    public PatronymicRetrievalError(Exception cause) {
        super("Ошибка получения отчества пользователя:", cause);
    }

}
