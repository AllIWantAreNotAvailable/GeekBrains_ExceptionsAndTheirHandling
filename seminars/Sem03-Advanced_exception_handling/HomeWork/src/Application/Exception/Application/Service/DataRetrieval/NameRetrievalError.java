package Application.Exception.Application.Service.DataRetrieval;

import Application.Exception.Application.Service.DataRetrievalException;

public class NameRetrievalError extends DataRetrievalException {

    public NameRetrievalError(Exception cause) {
        super("Ошибка получения имени пользователя:", cause);
    }

    public NameRetrievalError(String message, Exception cause) {
        super(message, cause);
    }

}
