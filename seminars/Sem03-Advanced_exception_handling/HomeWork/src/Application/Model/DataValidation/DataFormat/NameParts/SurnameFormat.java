package Application.Model.DataValidation.DataFormat.NameParts;

import Application.Exception.Application.Service.DataValidation.SurnameFormatError;
import Application.Model.DataValidation.DataFormat.NamePartsFormat;

import java.util.List;

public class SurnameFormat extends NamePartsFormat {

    @Override
    public void start(List<String> data) throws SurnameFormatError {
        String surname = data.get(0);
        String regex = this.getRegex();
        if (!surname.matches(regex)) {
            throw new SurnameFormatError();
        }
    }

}
