package Application.Model.DataValidation.DataFormat;

import Application.Exception.Application.Service.DataValidation.NameFormatError;
import Application.Exception.Application.Service.DataValidation.PatronymicFormatError;
import Application.Exception.Application.Service.DataValidation.SurnameFormatError;
import Application.Model.DataValidation.DataFormat.NameParts.NameFormat;
import Application.Model.DataValidation.DataFormat.NameParts.PatronymicFormat;
import Application.Model.DataValidation.DataFormat.NameParts.SurnameFormat;
import Application.Model.DataValidation.DataFormatValidator;

import java.util.List;

public class NamePartsFormat extends DataFormatValidator {

    public NamePartsFormat() {
        super("^[А-ЯЁІЇЄA-Z][а-яёіїєa-z]+$");
    }

    @Override
    public void start(List<String> data) throws SurnameFormatError, NameFormatError, PatronymicFormatError {
        new SurnameFormat().start(data);
        new NameFormat().start(data);
        new PatronymicFormat().start(data);
    }

}
