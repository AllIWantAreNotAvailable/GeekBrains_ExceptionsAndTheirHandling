package Application.Model.DataValidation;

import Application.Exception.Application.Service.DataValidationException;
import Application.Model.DataValidation.DataFormat.BirthdayFormat;
import Application.Model.DataValidation.DataFormat.GenderFormat;
import Application.Model.DataValidation.DataFormat.NamePartsFormat;
import Application.Model.DataValidation.DataFormat.PhoneNumberFormat;
import Application.Model.DataValidationService;

import java.util.List;

public class DataFormatValidator extends DataValidationService {

    private String regex;

    public DataFormatValidator() {
        this("");
    }

    public DataFormatValidator(String regex) {
        this.setRegex(regex);
    }

    public String getRegex() {
        return this.regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    @Override
    public void start(List<String> data) throws DataValidationException {
        new NamePartsFormat().start(data);
        new BirthdayFormat().start(data);
        new PhoneNumberFormat().start(data);
        new GenderFormat().start(data);
    }

}
