package Application.Exception.Application.Service;

import Application.Exception.Application.ServiceException;

public class DataRetrievalException extends ServiceException {

    public DataRetrievalException(Exception cause) {
        super("Ошибка сервиса получения данных пользователя:", cause);
    }

    public DataRetrievalException(String message, Exception cause) {
        super(message, cause);
    }

}
