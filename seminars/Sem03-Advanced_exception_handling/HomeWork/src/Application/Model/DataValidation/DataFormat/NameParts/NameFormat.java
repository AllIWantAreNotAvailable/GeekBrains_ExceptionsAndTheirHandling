package Application.Model.DataValidation.DataFormat.NameParts;

import Application.Exception.Application.Service.DataValidation.NameFormatError;
import Application.Model.DataValidation.DataFormat.NamePartsFormat;

import java.util.List;

public class NameFormat extends NamePartsFormat {

    @Override
    public void start(List<String> data) throws NameFormatError {
        String name = data.get(1);
        String regex = this.getRegex();
        if (!name.matches(regex)) {
            throw new NameFormatError();
        }
    }

}
