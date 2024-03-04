package Application.Exception.Application.Service;

import Application.Exception.Application.ServiceException;

public class DataValidationException extends ServiceException {

    public DataValidationException() {
        this("Ошибка сервиса валидации данных");
    }

    public DataValidationException(String message) {
        super(message);
    }

    public DataValidationException(Exception cause) {
        super("Ошибка сервиса валидации данных:", cause);
    }

    public DataValidationException(String message, Exception cause) {
        super(message, cause);
    }

}
