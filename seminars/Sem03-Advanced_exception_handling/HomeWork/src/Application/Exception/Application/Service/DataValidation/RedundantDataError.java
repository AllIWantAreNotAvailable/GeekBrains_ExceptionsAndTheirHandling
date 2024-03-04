package Application.Exception.Application.Service.DataValidation;

import Application.Exception.Application.Service.DataValidationException;

public class RedundantDataError extends DataValidationException {

    public RedundantDataError() {
        super("Ошибка, избыточное количество данных пользователя.");
    }

}
