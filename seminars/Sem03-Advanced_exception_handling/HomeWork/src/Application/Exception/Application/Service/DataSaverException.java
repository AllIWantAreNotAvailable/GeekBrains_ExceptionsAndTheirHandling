package Application.Exception.Application.Service;

import Application.Exception.ApplicationException;

public class DataSaverException extends ApplicationException {

    public DataSaverException(Exception cause) {
        super("Ошибка сервиса сохранения данных в файл:", cause);
    }

    public DataSaverException(String message, Exception cause) {
        super(message, cause);
    }

}
