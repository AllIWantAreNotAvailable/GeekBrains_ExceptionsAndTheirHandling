package Application.Model.DataValidation.DataFormat;

import Application.Exception.Application.Service.DataValidation.PhoneNumberFormatError;
import Application.Model.DataValidation.DataFormatValidator;

import java.util.List;

/**
 * <p>Класс для проверки соответствия номера телефона пользователя требуемому формату данных.
 * Реализует проверку наследуя функционал класса {@link DataFormatValidator}.
 * <p>Проверяет, что номер телефона имеет вид целого беззнакового числа без форматирования.
 */
public class PhoneNumberFormat extends DataFormatValidator {

    /**
     * Конструктор по умолчанию. Устанавливает регулярное выражение для проверки формата номера телефона.
     */
    public PhoneNumberFormat() {
        super("^\\d+$");
    }

    /**
     * Проверяет соответствие номера телефона требуемому формату.
     *
     * @param data список строк данных, содержащий номер телефона.
     * @throws PhoneNumberFormatError если номер телефона не соответствует требуемому формату.
     */
    @Override
    public void start(List<String> data) throws PhoneNumberFormatError {
        String phoneNumber = data.get(4);
        String regex = this.getRegex();
        if (!phoneNumber.matches(regex)) {
            throw new PhoneNumberFormatError();
        }
    }

}
