package Application.Model.DataValidation;

import Application.Exception.Application.Service.DataValidation.NotEnoughDataError;
import Application.Exception.Application.Service.DataValidation.RedundantDataError;
import Application.Model.DataValidationService;

import java.util.List;

public class DataAmountValidator extends DataValidationService {

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
