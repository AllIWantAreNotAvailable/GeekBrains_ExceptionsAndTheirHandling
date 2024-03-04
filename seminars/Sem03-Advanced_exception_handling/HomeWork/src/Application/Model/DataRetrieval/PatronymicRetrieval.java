package Application.Model.DataRetrieval;

import Application.View.View;
import Application.Exception.Application.Service.DataRetrieval.PatronymicRetrievalError;
import Application.Exception.Application.ViewException;
import Application.Model.DataRetrievalService;

import java.util.List;

public class PatronymicRetrieval extends DataRetrievalService {

    @Override
    protected String getRequestText() {
        return """
                Введите ваше отчество:
                >>>\s""";
    }

    @Override
    public void start(List<String> data) throws PatronymicRetrievalError {
        this.setData(data);
        View view = this.getView();
        try {
            view.request(getRequestText());
            data.set(2, view.response());
        } catch (ViewException exception) {
            throw new PatronymicRetrievalError(exception);
        }
    }

}
