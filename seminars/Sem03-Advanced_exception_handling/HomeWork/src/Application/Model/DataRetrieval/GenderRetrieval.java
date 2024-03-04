package Application.Model.DataRetrieval;

import Application.View.View;
import Application.Exception.Application.Service.DataRetrieval.GenderRetrievalError;
import Application.Exception.Application.ViewException;
import Application.Model.DataRetrievalService;

import java.util.List;

public class GenderRetrieval extends DataRetrievalService {

    @Override
    protected String getRequestText() {
        return """
                Введите ваш пол:
                >>>\s""";
    }

    @Override
    public void start(List<String> data) throws GenderRetrievalError {
        this.setData(data);
        View view = this.getView();
        try {
            view.request(getRequestText());
            data.set(5, view.response());
        } catch (ViewException exception) {
            throw new GenderRetrievalError(exception);
        }
    }

}
