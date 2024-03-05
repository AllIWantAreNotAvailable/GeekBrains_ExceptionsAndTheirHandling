package Application.Model;

import Application.Exception.Application.Service.DataValidationException;
import Application.Model.DataValidation.DataAmountValidator;
import Application.Model.DataValidation.DataFormatValidator;

import java.util.List;

public class DataValidationService extends BaseModel implements Service {

    @Override
    public void start(List<String> data) throws DataValidationException {
        new DataAmountValidator().start(data);
        new DataFormatValidator().start(data);
    }

}
