package Application.Exception.Application.Service.DataRetrieval;

import Application.Exception.Application.Service.DataRetrievalException;

/**
 * Исключение, выбрасываемое при возникновении ошибки при получении номера телефона пользователя.
 */
public class PhoneNumberRetrievalError extends DataRetrievalException {

    /**
     * Создает новое исключение с сообщением об ошибке получения номера телефона пользователя.
     *
     * @param cause Причина исключения.
     */
    public PhoneNumberRetrievalError(Exception cause) {
        super("Ошибка получения номера телефона пользователя:", cause);
    }

}
