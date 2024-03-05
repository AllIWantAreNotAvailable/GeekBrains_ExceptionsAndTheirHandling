package Application.Exception.Application;

import Application.Exception.ApplicationException;

/**
 * Исключение, которое возникает в сервисах приложения, используемое для представления непредвиденных ошибок приложения.
 */
public class ServiceException extends ApplicationException {

    /**
     * Конструктор с сообщением об ошибке.
     *
     * @param message сообщение об ошибке
     */
    public ServiceException(String message) {
        super(message);
    }

    /**
     * Конструктор с сообщением об ошибке и причиной.
     *
     * @param message сообщение об ошибке
     * @param cause   исключение-причина
     */
    public ServiceException(String message, Exception cause) {
        super(message, cause);
    }

}
