package Application.Model.DataValidation;

import Application.Exception.Application.Service.DataValidationException;
import Application.Model.DataValidation.DataFormat.BirthdayFormat;
import Application.Model.DataValidation.DataFormat.GenderFormat;
import Application.Model.DataValidation.DataFormat.FullNameFormat;
import Application.Model.DataValidation.DataFormat.PhoneNumberFormat;
import Application.Model.DataValidationService;

import java.util.List;

/**
 * <p>Класс для проверки соответствия данных требуемому формату.
 * Проверяет каждую строку данных из списка на соответствие определенному формату.
 * <p>Реализует проверку наследуя функционал класса {@link DataValidationService}.
 */
public class DataFormatValidator extends DataValidationService {

    /**
     * Регулярное выражение для проверки формата данных.
     */
    private String regex;

    /**
     * Конструктор по умолчанию. Устанавливает пустое регулярное выражение.
     */
    public DataFormatValidator() {
        this("");
    }

    /**
     * Конструктор с параметром, устанавливающий регулярное выражение.
     *
     * @param regex регулярное выражение для проверки формата данных.
     */
    public DataFormatValidator(String regex) {
        this.setRegex(regex);
    }

    /**
     * Получает регулярное выражение.
     *
     * @return регулярное выражение.
     */
    public String getRegex() {
        return this.regex;
    }

    /**
     * Устанавливает регулярное выражение.
     *
     * @param regex регулярное выражение для проверки формата данных.
     */
    public void setRegex(String regex) {
        this.regex = regex;
    }

    /**
     * Проверяет соответствие данных требуемому формату.
     *
     * @param data список строк данных для проверки.
     * @throws DataValidationException если данные не соответствуют требуемому формату.
     */
    @Override
    public void start(List<String> data) throws DataValidationException {
        new FullNameFormat().start(data);
        new BirthdayFormat().start(data);
        new PhoneNumberFormat().start(data);
        new GenderFormat().start(data);
    }

}
