package Application.Exception.Application.Service;

import Application.Exception.Application.ServiceException;

/**
 * Исключение, которое выбрасывается при валидации данных в сервисах приложения.
 */
public class DataValidationException extends ServiceException {

    /**
     * Создает новое исключение с сообщением "Ошибка сервиса валидации данных".
     */
    public DataValidationException() {
        this("Ошибка сервиса валидации данных.");
    }

    /**
     * Создает новое исключение с указанным сообщением.
     *
     * @param message сообщение об ошибке
     */
    public DataValidationException(String message) {
        super(message);
    }

    /**
     * Создает новое исключение с указанной причиной.
     *
     * @param cause причина исключения
     */
    public DataValidationException(Exception cause) {
        super("Ошибка сервиса валидации данных:", cause);
    }

    /**
     * Создает новое исключение с указанным сообщением и причиной.
     *
     * @param message сообщение об ошибке
     * @param cause   причина исключения
     */
    public DataValidationException(String message, Exception cause) {
        super(message, cause);
    }

}
