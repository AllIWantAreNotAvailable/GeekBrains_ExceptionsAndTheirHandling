package Application.Exception.Application.Service.DataValidation;

import Application.Exception.Application.Service.DataValidationException;

public class PhoneNumberFormatError extends DataValidationException {

    public PhoneNumberFormatError() {
        super("Ошибка, некорректный формат номера телефона пользователя.");
    }

}
