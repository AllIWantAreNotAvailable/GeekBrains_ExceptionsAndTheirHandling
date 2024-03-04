package Application.Exception.Application.Service.DataValidation;

import Application.Exception.Application.Service.DataValidationException;

public class PatronymicFormatError extends DataValidationException {

    public PatronymicFormatError() {
        super("Ошибка, некорректный формат отчества пользователя.");
    }

}
