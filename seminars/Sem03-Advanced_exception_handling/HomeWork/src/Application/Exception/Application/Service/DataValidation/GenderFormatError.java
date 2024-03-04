package Application.Exception.Application.Service.DataValidation;

import Application.Exception.Application.Service.DataValidationException;

public class GenderFormatError extends DataValidationException {

    public GenderFormatError() {
        super("Ошибка, некорректный формат пола пользователя.");
    }

}
