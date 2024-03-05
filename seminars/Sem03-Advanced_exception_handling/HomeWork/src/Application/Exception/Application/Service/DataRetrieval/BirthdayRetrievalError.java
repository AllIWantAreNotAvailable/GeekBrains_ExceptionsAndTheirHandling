package Application.Exception.Application.Service.DataRetrieval;

import Application.Exception.Application.Service.DataRetrievalException;

/**
 * Исключение, выбрасываемое при возникновении ошибки при получении даты рождения пользователя.
 */
public class BirthdayRetrievalError extends DataRetrievalException {

    /**
     * Создает новое исключение с сообщением об ошибке получения даты рождения пользователя.
     *
     * @param cause Причина исключения.
     */

    public BirthdayRetrievalError(Exception cause) {
        super("Ошибка получения даты рождения пользователя:", cause);
    }

}
