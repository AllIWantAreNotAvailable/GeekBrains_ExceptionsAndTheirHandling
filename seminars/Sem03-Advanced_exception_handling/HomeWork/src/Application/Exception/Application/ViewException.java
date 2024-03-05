package Application.Exception.Application;

import Application.Exception.ApplicationException;

/**
 * Исключение, которое возникает во view-слое приложения, используемое для представления непредвиденных ошибок приложения.
 */
public class ViewException extends ApplicationException {

    /**
     * Создает новое исключение с указанной причиной.
     *
     * @param cause причина исключения
     */
    public ViewException(Exception cause) {
        super("Ошибка пользовательского интерфейса:", cause);
    }

    /**
     * Создает новое исключение с указанным сообщением и причиной.
     *
     * @param message сообщение об ошибке
     * @param cause   причина исключения
     */
    public ViewException(String message, Exception cause) {
        super(message, cause);
    }

}
