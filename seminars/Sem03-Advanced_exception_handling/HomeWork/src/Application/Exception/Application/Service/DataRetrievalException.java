package Application.Exception.Application.Service;

import Application.Exception.Application.ServiceException;

/**
 * Исключение, которое может быть выброшено во время получения данных в сервисах приложения.
 */
public class DataRetrievalException extends ServiceException {

    /**
     * Создает новое исключение с указанной причиной.
     *
     * @param cause причина исключения
     */
    public DataRetrievalException(Exception cause) {
        super("Ошибка сервиса получения данных пользователя:", cause);
    }

    /**
     * Создает новое исключение с указанным сообщением и причиной.
     *
     * @param message сообщение об ошибке
     * @param cause   причина исключения
     */
    public DataRetrievalException(String message, Exception cause) {
        super(message, cause);
    }

}
