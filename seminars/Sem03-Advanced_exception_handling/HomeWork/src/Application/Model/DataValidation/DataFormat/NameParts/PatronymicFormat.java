package Application.Model.DataValidation.DataFormat.NameParts;

import Application.Exception.Application.Service.DataValidation.PatronymicFormatError;
import Application.Model.DataValidation.DataFormat.NamePartsFormat;

import java.util.List;

public class PatronymicFormat extends NamePartsFormat {

    @Override
    public void start(List<String> data) throws PatronymicFormatError {
        String patronymic = data.get(2);
        String regex = this.getRegex();
        if (!patronymic.matches(regex)) {
            throw new PatronymicFormatError();
        }
    }

}
