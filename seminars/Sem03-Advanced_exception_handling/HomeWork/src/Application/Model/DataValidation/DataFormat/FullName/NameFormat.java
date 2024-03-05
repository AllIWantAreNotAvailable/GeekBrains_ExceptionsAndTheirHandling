package Application.Model.DataValidation.DataFormat.FullName;

import Application.Exception.Application.Service.DataValidation.NameFormatError;
import Application.Model.DataValidation.DataFormat.FullNameFormat;

import java.util.List;

/**
 * <p>Класс для проверки соответствия имени пользователя требуемому формату данных.
 * Реализует проверку наследуя функционал класса {@link FullNameFormat}.
 * <p>Проверяет, что имя пользователя:
 * <li>состоит только из букв русского или английского алфавита;
 * <li>начинается с заглавной буквы.
 */
public class NameFormat extends FullNameFormat {

    /**
     * Проверяет соответствие имени пользователя требуемому формату данных.
     *
     * @param data список строк данных, содержащих фамилию, имя и отчество пользователя.
     * @throws NameFormatError если имя не соответствует требуемому формату.
     */
    @Override
    public void start(List<String> data) throws NameFormatError {
        String name = data.get(1);
        String regex = this.getRegex();
        if (!name.matches(regex)) {
            throw new NameFormatError();
        }
    }

}
