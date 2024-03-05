package Application.Exception.Application.Service;

import Application.Exception.Application.ServiceException;

public class DataSaverException extends ServiceException {

    public DataSaverException(Exception cause) {
        super("Ошибка сервиса сохранения данных в файл:", cause);
    }

    public DataSaverException(String message, Exception cause) {
        super(message, cause);
    }

}
