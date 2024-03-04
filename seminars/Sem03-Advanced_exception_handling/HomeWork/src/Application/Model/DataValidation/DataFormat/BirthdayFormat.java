package Application.Model.DataValidation.DataFormat;

import Application.Exception.Application.Service.DataValidation.BirthdayFormatError;
import Application.Model.DataValidation.DataFormatValidator;

import java.util.List;

public class BirthdayFormat extends DataFormatValidator {

    public BirthdayFormat() {
        super("^(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.\\d{4}$");
    }

    @Override
    public void start(List<String> data) throws BirthdayFormatError {
        String birthday = data.get(3);
        String regex = this.getRegex();
        if (!birthday.matches(regex)) {
            throw new BirthdayFormatError();
        }
    }

}
