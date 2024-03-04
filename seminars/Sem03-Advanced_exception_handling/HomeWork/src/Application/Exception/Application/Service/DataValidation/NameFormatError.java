package Application.Exception.Application.Service.DataValidation;

import Application.Exception.Application.Service.DataValidationException;

public class NameFormatError extends DataValidationException {

    public NameFormatError() {
        super("Ошибка, некорректный формат имени пользователя.");
    }

}
