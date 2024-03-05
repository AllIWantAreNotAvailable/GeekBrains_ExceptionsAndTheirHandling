package Application.Exception.Application.Service.DataRetrieval;

import Application.Exception.Application.Service.DataRetrievalException;

public class PhoneNumberRetrievalError extends DataRetrievalException {

    public PhoneNumberRetrievalError(Exception cause) {
        super("Ошибка получения номера телефона пользователя:", cause);
    }

}
