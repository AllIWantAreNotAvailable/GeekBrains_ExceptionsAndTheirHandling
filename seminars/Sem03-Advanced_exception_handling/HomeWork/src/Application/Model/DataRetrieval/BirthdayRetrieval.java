package Application.Model.DataRetrieval;

import Application.View.View;
import Application.Exception.Application.Service.DataRetrieval.BirthdayRetrievalError;
import Application.Exception.Application.ViewException;
import Application.Model.DataRetrievalService;

import java.util.List;

public class BirthdayRetrieval extends DataRetrievalService {

    @Override
    protected String getRequestText() {
        return """
                Введите вашу дату рождения:
                >>>\s""";
    }

    @Override
    public void start(List<String> data) throws BirthdayRetrievalError {
        this.setData(data);
        View view = this.getView();
        try {
            view.request(getRequestText());
            data.set(3, view.response());
        } catch (ViewException exception) {
            throw new BirthdayRetrievalError(exception);
        }
    }

}
