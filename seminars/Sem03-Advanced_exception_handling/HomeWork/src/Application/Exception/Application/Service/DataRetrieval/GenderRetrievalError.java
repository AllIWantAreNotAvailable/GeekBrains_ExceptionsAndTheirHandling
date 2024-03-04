package Application.Exception.Application.Service.DataRetrieval;

import Application.Exception.Application.Service.DataRetrievalException;

public class GenderRetrievalError extends DataRetrievalException {

    public GenderRetrievalError(Exception cause) {
        super("Ошибка получения пола пользователя:", cause);
    }

    public GenderRetrievalError(String message, Exception cause) {
        super(message, cause);
    }

}
