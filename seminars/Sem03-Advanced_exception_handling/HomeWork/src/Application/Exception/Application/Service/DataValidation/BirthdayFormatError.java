package Application.Exception.Application.Service.DataValidation;

import Application.Exception.Application.Service.DataValidationException;

/**
 * Исключение, выбрасываемое при обнаружении некорректного формата даты рождения пользователя.
 */
public class BirthdayFormatError extends DataValidationException {

    /**
     * Создает новое исключение с сообщением о некорректном формате даты рождения.
     */
    public BirthdayFormatError() {
        super("""
                Некорректный формат даты рождения. Дату рождения необходимо указать в формате "dd.MM.yyyy", где:
                \t- dd - номер дня месяца, целое двузначное беззнаковое число с лидирующим нулем (00-31);
                \t- MM - номер месяца, целое двузначное беззнаковое число с лидирующим нулем (00-12);
                \t- yyyy - номер года, целое четырехзначное беззнаковое число с лидирующим нулем (0000-9999).
                """);
    }

}
