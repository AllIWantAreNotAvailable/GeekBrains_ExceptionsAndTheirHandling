package Application.Exception.Application.Service.DataValidation;

import Application.Exception.Application.Service.DataValidationException;

/**
 * Исключение, выбрасываемое при обнаружении некорректного формата имени пользователя.
 */
public class NameFormatError extends DataValidationException {

    /**
     * Создает новое исключение с сообщением о некорректном формате имени.
     */
    public NameFormatError() {
        super("""
                Некорректный формат имени. Имя должно:
                \t- состоять только из букв русского или английского алфавита;
                \t- начинаться с буквы в верхнем регистре (заглавной, строчной).
                """);
    }

}
