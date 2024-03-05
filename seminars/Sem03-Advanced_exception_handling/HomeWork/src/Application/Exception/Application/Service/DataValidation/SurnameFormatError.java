package Application.Exception.Application.Service.DataValidation;

import Application.Exception.Application.Service.DataValidationException;

/**
 * Исключение, выбрасываемое при обнаружении некорректного формата фамилии пользователя.
 */
public class SurnameFormatError extends DataValidationException {

    /**
     * Создает новое исключение с сообщением о некорректном формате фамилии пользователя.
     */
    public SurnameFormatError() {
        super("""
                Некорректный формат фамилии. Фамилия должна:
                \t- состоять только из букв русского или английского алфавита;
                \t- начинаться с буквы в верхнем регистре (заглавной, строчной).
                """);
    }

}
