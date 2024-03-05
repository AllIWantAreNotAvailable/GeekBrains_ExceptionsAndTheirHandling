package Application.Model.DataValidation.DataFormat;

import Application.Exception.Application.Service.DataValidation.GenderFormatError;
import Application.Model.DataValidation.DataFormatValidator;

import java.util.List;

/**
 * <p>Класс для проверки соответствия пола пользователя требуемому формату данных.
 * Реализует проверку наследуя функционал класса {@link DataFormatValidator}.
 * <p>Проверяет, что пол пользователя представлен одной из следующих букв:
 * <li>M, m, М, м - мужской;
 * <li>F, f, Ж, ж - женский.
 */
public class GenderFormat extends DataFormatValidator {

    /**
     * Конструктор по умолчанию. Устанавливает регулярное выражение для проверки формата пола пользователя.
     */
    public GenderFormat() {
        super("^[MmFfМмЖж]$");
    }

    /**
     * Проверяет соответствие пола пользователя требуемому формату.
     *
     * @param data список строк данных, содержащий пол пользователя.
     * @throws GenderFormatError если пол пользователя не соответствует требуемому формату.
     */
    @Override
    public void start(List<String> data) throws GenderFormatError {
        String gender = data.get(5);
        String regex = this.getRegex();
        if (!gender.matches(regex)) {
            throw new GenderFormatError();
        }
    }

}
