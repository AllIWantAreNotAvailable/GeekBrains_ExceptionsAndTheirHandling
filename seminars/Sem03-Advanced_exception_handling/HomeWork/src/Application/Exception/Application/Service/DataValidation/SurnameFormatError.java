package Application.Exception.Application.Service.DataValidation;

import Application.Exception.Application.Service.DataValidationException;

public class SurnameFormatError extends DataValidationException {

    public SurnameFormatError() {
        super("Ошибка, некорректный формат фамилии пользователя.");
    }

}
