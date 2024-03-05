package Application.Model;

import Application.Exception.Application.Service.DataValidationException;
import Application.Model.DataValidation.DataAmountValidator;
import Application.Model.DataValidation.DataFormatValidator;

import java.util.List;

/**
 * Сервис для валидации данных, который проверяет соответствие данных определенным правилам.
 * Реализует интерфейс {@link Service}.
 */
public class DataValidationService extends BaseModel implements Service {

    /**
     * Запускает сервис валидации данных с заданными данными.
     * В процессе выполнения сервиса проверяет соответствие данных определенным правилам:
     * <li>Соответсвие требуемому колличесву.
     * <li>Соответсвие определенным форматам данных.
     * <p>
     *
     * @param data список строк данных для валидации.
     * @throws DataValidationException если происходит ошибка в процессе валидации данных.
     */
    @Override
    public void start(List<String> data) throws DataValidationException {
        new DataAmountValidator().start(data);
        new DataFormatValidator().start(data);
    }

}
