package Application.Exception.Application.Service.DataValidation;

import Application.Exception.Application.Service.DataValidationException;

/**
 * Исключение, выбрасываемое при обнаружении избыточного количества данных, введенных пользователем.
 */
public class RedundantDataError extends DataValidationException {

    /**
     * Создает новое исключение с сообщением о избыточном количестве данных.
     */
    public RedundantDataError() {
        super("""
                Вы ввели слишком много данных.
                """);
    }

}
