package Application.Model.DataValidation.DataFormat;

import Application.Exception.Application.Service.DataValidation.PhoneNumberFormatError;
import Application.Model.DataValidation.DataFormatValidator;

import java.util.List;

public class PhoneNumberFormat extends DataFormatValidator {

    public PhoneNumberFormat() {
        super("^\\d+$");
    }

    @Override
    public void start(List<String> data) throws PhoneNumberFormatError {
        String phoneNumber = data.get(4);
        String regex = this.getRegex();
        if (!phoneNumber.matches(regex)) {
            throw new PhoneNumberFormatError();
        }
    }

}
