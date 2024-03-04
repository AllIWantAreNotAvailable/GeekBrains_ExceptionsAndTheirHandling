package Application.Model.DataRetrieval;

import Application.View.View;
import Application.Exception.Application.Service.DataRetrieval.SurnameRetrievalError;
import Application.Exception.Application.ViewException;
import Application.Model.DataRetrievalService;

import java.util.List;

public class SurnameRetrieval extends DataRetrievalService {

    @Override
    protected String getRequestText() {
        return """
                Введите вашу фамилию:
                >>>\s""";
    }

    @Override
    public void start(List<String> data) throws SurnameRetrievalError {
        this.setData(data);
        View view = this.getView();
        try {
            view.request(getRequestText());
            data.set(0, view.response());
        } catch (ViewException exception) {
            throw new SurnameRetrievalError(exception);
        }
    }

}
