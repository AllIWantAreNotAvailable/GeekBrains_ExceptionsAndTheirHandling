package Application.Exception.Application.Service.DataValidation;

import Application.Exception.Application.Service.DataValidationException;

public class NotEnoughDataError extends DataValidationException {

    public NotEnoughDataError() {
        super("Ошибка, недостаточно данных пользователя.");
    }

}
