package Application.Exception.Application.Service.DataRetrieval;

import Application.Exception.Application.Service.DataRetrievalException;

public class PatronymicRetrievalError extends DataRetrievalException {

    public PatronymicRetrievalError(Exception cause) {
        super("Ошибка получения отчества пользователя:", cause);
    }

}
