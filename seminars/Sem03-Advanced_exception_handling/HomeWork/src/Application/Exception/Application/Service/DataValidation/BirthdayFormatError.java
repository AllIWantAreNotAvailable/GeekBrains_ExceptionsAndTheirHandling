package Application.Exception.Application.Service.DataValidation;

import Application.Exception.Application.Service.DataValidationException;

public class BirthdayFormatError extends DataValidationException {

    public BirthdayFormatError() {
        super("Ошибка, некорректный формат дня рождения пользователя.");
    }

}
