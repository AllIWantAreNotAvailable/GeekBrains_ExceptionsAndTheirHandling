package Application.Exception.Application.Service.DataRetrieval;

import Application.Exception.Application.Service.DataRetrievalException;

public class BirthdayRetrievalError extends DataRetrievalException {

    public BirthdayRetrievalError(Exception cause) {
        super("Ошибка получения даты рождения пользователя:", cause);
    }

}
