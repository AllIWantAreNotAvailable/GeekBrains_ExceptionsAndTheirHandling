package Application.Exception.Application.Service.DataValidation;

import Application.Exception.Application.Service.DataValidationException;

/**
 * Исключение, выбрасываемое при обнаружении некорректного формата номера телефона пользователя.
 */
public class PhoneNumberFormatError extends DataValidationException {

    /**
     * Создает новое исключение с сообщением о некорректном формате номера телефона пользователя.
     */
    public PhoneNumberFormatError() {
        super("""
                Некорректный формат номера телефона. Номер телефна должен имееть вид целого беззнакового \
                числа без форматирования, пример: `89997775554433`.
                """);
    }

}
