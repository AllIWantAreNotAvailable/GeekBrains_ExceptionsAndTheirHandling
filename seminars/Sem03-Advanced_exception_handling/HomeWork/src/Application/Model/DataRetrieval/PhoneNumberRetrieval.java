package Application.Model.DataRetrieval;

import Application.View.View;
import Application.Exception.Application.Service.DataRetrieval.PhoneNumberRetrievalError;
import Application.Exception.Application.ViewException;
import Application.Model.DataRetrievalService;

import java.util.List;

public class PhoneNumberRetrieval extends DataRetrievalService {

    @Override
    protected String getRequestText() {
        return """
                Введите ваш номер телефона:
                >>>\s""";
    }

    @Override
    public void start(List<String> data) throws PhoneNumberRetrievalError {
        this.setData(data);
        View view = this.getView();
        try {
            view.request(getRequestText());
            data.set(4, view.response());
        } catch (ViewException exception) {
            throw new PhoneNumberRetrievalError(exception);
        }
    }

}
