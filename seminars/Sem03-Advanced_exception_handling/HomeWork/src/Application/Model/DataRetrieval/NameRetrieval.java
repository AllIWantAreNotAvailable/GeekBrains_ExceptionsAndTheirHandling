package Application.Model.DataRetrieval;

import Application.View.View;
import Application.Exception.Application.Service.DataRetrieval.NameRetrievalError;
import Application.Exception.Application.ViewException;
import Application.Model.DataRetrievalService;

import java.util.List;

public class NameRetrieval extends DataRetrievalService {

    @Override
    protected String getRequestText() {
        return """
                Введите ваше имя:
                >>>\s""";
    }

    @Override
    public void start(List<String> data) throws NameRetrievalError {
        this.setData(data);
        View view = this.getView();
        try {
            view.request(getRequestText());
            data.set(1, view.response());
        } catch (ViewException exception) {
            throw new NameRetrievalError(exception);
        }
    }

}
