package Application.Model.DataValidation;

import Application.Exception.Application.Service.DataValidation.NotEnoughDataError;
import Application.Exception.Application.Service.DataValidation.RedundantDataError;
import Application.Model.DataValidationService;

import java.util.List;

/**
 * <p>Класс для проверки количества данных.
 * Проверяет, соответствует ли количество полученных данных требуемому количеству.
 * <p>Реализует проверку наследуя функционал класса {@link DataValidationService}.
 */
public class DataAmountValidator extends DataValidationService {

    /**
     * Проверяет количество данных.
     *
     * @param data список строк данных для проверки.
     * @throws NotEnoughDataError если количество данных меньше требуемого.
     * @throws RedundantDataError если количество данных больше требуемого.
     */
    @Override
    public void start(List<String> data) throws NotEnoughDataError, RedundantDataError {
        int amount = data.size();
        if (amount < 6) {
            throw new NotEnoughDataError();
        } else if (6 < amount) {
            throw new RedundantDataError();
        }
    }

}
