package Application.Model.DataValidation.DataFormat;

import Application.Exception.Application.Service.DataValidation.BirthdayFormatError;
import Application.Model.DataValidation.DataFormatValidator;

import java.util.List;

/**
 * Класс для проверки соответствия даты рождения пользователя требуемому формату данных.
 * Реализует проверку наследуя функционал класса {@link DataFormatValidator}.
 * Проверяет, что дата рождения имеет формат "dd.MM.yyyy".
 */
public class BirthdayFormat extends DataFormatValidator {

    /**
     * Конструктор по умолчанию. Устанавливает регулярное выражение для проферки формата даты рождения.
     */
    public BirthdayFormat() {
        super("^(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.\\d{4}$");
    }

    /**
     * Проверяет соответствие даты рождения требуемому формату.
     *
     * @param data список строк данных, содержащий дату рождения.
     * @throws BirthdayFormatError если дата рождения не соответствует требуемому формату.
     */
    @Override
    public void start(List<String> data) throws BirthdayFormatError {
        String birthday = data.get(3);
        String regex = this.getRegex();
        if (!birthday.matches(regex)) {
            throw new BirthdayFormatError();
        }
    }

}
