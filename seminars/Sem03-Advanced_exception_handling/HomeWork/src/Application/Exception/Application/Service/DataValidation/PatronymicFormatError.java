package Application.Exception.Application.Service.DataValidation;

import Application.Exception.Application.Service.DataValidationException;

/**
 * Исключение, выбрасываемое при обнаружении некорректного формата отчества пользователя.
 */
public class PatronymicFormatError extends DataValidationException {

    /**
     * Создает новое исключение с сообщением о некорректном формате отчества.
     */
    public PatronymicFormatError() {
        super("""
                Некорректный формат отчества. Отчество должно:
                \t- состоять только из букв русского или английского алфавита;
                \t- начинаться с буквы в верхнем регистре (заглавной, строчной).
                """);
    }

}
