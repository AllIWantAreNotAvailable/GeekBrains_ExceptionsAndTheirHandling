package Application.Exception.Application.Service;

import Application.Exception.Application.ServiceException;

/**
 * Исключение, которое может быть выброшено во время сохранения данных в сервисах приложения.
 */
public class DataSaverException extends ServiceException {

    /**
     * Создает новое исключение с указанной причиной.
     *
     * @param cause причина исключения
     */
    public DataSaverException(Exception cause) {
        super("Ошибка сервиса сохранения данных в файл:", cause);
    }

}
