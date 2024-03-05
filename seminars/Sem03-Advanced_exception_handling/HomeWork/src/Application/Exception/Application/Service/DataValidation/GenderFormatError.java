package Application.Exception.Application.Service.DataValidation;

import Application.Exception.Application.Service.DataValidationException;

/**
 * Исключение, выбрасываемое при обнаружении некорректного формата пола пользователя.
 */
public class GenderFormatError extends DataValidationException {

    /**
     * Создает новое исключение с сообщением о некорректном формате пола пользователя.
     */
    public GenderFormatError() {
        super("""
                Некорректный формат пола. Пол указывается в формате:
                \t- 'М', 'м', 'M', 'm' - мужской;
                \t- 'Ж', 'ж', 'F', 'f' - женский.
                """);
    }

}
