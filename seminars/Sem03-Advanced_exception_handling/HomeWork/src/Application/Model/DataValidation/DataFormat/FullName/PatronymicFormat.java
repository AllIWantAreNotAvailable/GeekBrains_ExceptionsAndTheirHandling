package Application.Model.DataValidation.DataFormat.FullName;

import Application.Exception.Application.Service.DataValidation.PatronymicFormatError;
import Application.Model.DataValidation.DataFormat.FullNameFormat;

import java.util.List;

/**
 * <p>Класс для проверки соответствия отчества пользователя требуемому формату данных.
 * Реализует проверку наследуя функционал класса {@link FullNameFormat}.
 * <p>Проверяет, что отчество пользователя:
 * <li>состоит только из букв русского или английского алфавита;
 * <li>начинается с заглавной буквы.
 */
public class PatronymicFormat extends FullNameFormat {

    /**
     * Проверяет соответствие отчества пользователя требуемому формату данных.
     *
     * @param data список строк данных, содержащих фамилию, имя и отчество пользователя.
     * @throws PatronymicFormatError если отчество не соответствует требуемому формату.
     */
    @Override
    public void start(List<String> data) throws PatronymicFormatError {
        String patronymic = data.get(2);
        String regex = this.getRegex();
        if (!patronymic.matches(regex)) {
            throw new PatronymicFormatError();
        }
    }

}
