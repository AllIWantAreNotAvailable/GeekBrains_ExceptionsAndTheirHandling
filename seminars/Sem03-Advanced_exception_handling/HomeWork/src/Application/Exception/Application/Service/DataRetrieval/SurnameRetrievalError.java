package Application.Exception.Application.Service.DataRetrieval;

import Application.Exception.Application.Service.DataRetrievalException;

public class SurnameRetrievalError extends DataRetrievalException {

    public SurnameRetrievalError(Exception cause) {
        super("Ошибка получения фамилии пользователя:", cause);
    }

}
