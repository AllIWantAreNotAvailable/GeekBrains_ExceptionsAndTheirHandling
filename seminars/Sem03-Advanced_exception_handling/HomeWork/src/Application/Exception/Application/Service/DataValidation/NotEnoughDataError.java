package Application.Exception.Application.Service.DataValidation;

import Application.Exception.Application.Service.DataValidationException;

/**
 * Исключение, выбрасываемое при обнаружении недостаточного количества данных.
 */
public class NotEnoughDataError extends DataValidationException {

    /**
     * Создает новое исключение с сообщением о нехватке данных.
     */
    public NotEnoughDataError() {
        super("""
                Вы ввели слишком мало данных.
                """);
    }

}
