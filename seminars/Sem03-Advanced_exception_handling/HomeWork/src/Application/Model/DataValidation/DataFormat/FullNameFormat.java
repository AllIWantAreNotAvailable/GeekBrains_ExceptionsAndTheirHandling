package Application.Model.DataValidation.DataFormat;

import Application.Exception.Application.Service.DataValidation.NameFormatError;
import Application.Exception.Application.Service.DataValidation.PatronymicFormatError;
import Application.Exception.Application.Service.DataValidation.SurnameFormatError;
import Application.Model.DataValidation.DataFormat.FullName.NameFormat;
import Application.Model.DataValidation.DataFormat.FullName.PatronymicFormat;
import Application.Model.DataValidation.DataFormat.FullName.SurnameFormat;
import Application.Model.DataValidation.DataFormatValidator;

import java.util.List;

/**
 * <p>Класс для проверки соответствия полного имени пользователя требуемому формату данных.
 * Реализует проверку наследуя функционал класса {@link DataFormatValidator}.
 * <p>Проверяет, что каждая часть полного имени пользователя (фамилия, имя, отчество):
 * <li>состоит только из букв русского или английского алфавита;
 * <li>начинается с заглавной буквы.
 */
public class FullNameFormat extends DataFormatValidator {

    /**
     * Конструктор по умолчанию. Устанавливает регулярное выражение для проверки формата полного имени пользователя.
     */
    public FullNameFormat() {
        super("^[А-ЯЁІЇЄA-Z][а-яёіїєa-z]+$");
    }

    /**
     * Проверяет соответствие полного имени пользователя требуемому формату данных.
     *
     * @param data список строк данных, содержащих фамилию, имя и отчество пользователя.
     * @throws SurnameFormatError если фамилия не соответствует требуемому формату.
     * @throws NameFormatError если имя не соответствует требуемому формату.
     * @throws PatronymicFormatError если отчество не соответствует требуемому формату.
     */
    @Override
    public void start(List<String> data) throws SurnameFormatError, NameFormatError, PatronymicFormatError {
        new SurnameFormat().start(data);
        new NameFormat().start(data);
        new PatronymicFormat().start(data);
    }

}
