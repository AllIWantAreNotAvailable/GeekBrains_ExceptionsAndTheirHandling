package Application.Model.DataValidation.DataFormat;

import Application.Exception.Application.Service.DataValidation.GenderFormatError;
import Application.Model.DataValidation.DataFormatValidator;

import java.util.List;

public class GenderFormat extends DataFormatValidator {

    public GenderFormat() {
        super("^[MmFfМмЖж]$");
    }

    @Override
    public void start(List<String> data) throws GenderFormatError {
        String gender = data.get(5);
        String regex = this.getRegex();
        if (!gender.matches(regex)) {
            throw new GenderFormatError();
        }
    }

}
