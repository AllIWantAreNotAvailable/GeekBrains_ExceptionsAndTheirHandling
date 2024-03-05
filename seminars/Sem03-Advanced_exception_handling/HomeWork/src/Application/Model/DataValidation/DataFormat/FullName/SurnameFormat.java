package Application.Model.DataValidation.DataFormat.FullName;

import Application.Exception.Application.Service.DataValidation.SurnameFormatError;
import Application.Model.DataValidation.DataFormat.FullNameFormat;

import java.util.List;

/**
 * <p>Класс для проверки соответствия фамилии пользователя требуемому формату данных.
 * Реализует проверку наследуя функционал класса {@link FullNameFormat}.
 * <p>Проверяет, что фамилия пользователя:
 * <li>состоит только из букв русского или английского алфавита;
 * <li>начинается с заглавной буквы.
 */
public class SurnameFormat extends FullNameFormat {

    /**
     * Проверяет соответствие фамилии пользователя требуемому формату данных.
     *
     * @param data список строк данных, содержащих фамилию, имя и отчество пользователя.
     * @throws SurnameFormatError если фамилия не соответствует требуемому формату.
     */
    @Override
    public void start(List<String> data) throws SurnameFormatError {
        String surname = data.get(0);
        String regex = this.getRegex();
        if (!surname.matches(regex)) {
            throw new SurnameFormatError();
        }
    }

}
