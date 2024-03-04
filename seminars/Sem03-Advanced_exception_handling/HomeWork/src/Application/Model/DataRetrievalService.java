package Application.Model;

import Application.View.View;
import Application.Controller.ViewController;
import Application.Exception.Application.Service.DataRetrievalException;
import Application.Exception.Application.ViewException;

import java.util.Collections;
import java.util.List;

public class DataRetrievalService extends BaseModel implements Service {

    private List<String> data;
    private View view;

    public DataRetrievalService() {
        this.setView(new ViewController());
    }

    public List<String> getData() {
        return this.data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public View getView() {
        return this.view;
    }

    public void setView(View view) {
        this.view = view;
    }

    protected String getRequestText() {
        return """
                Введите ваши данные через пробел:
                \t- Фамилия;
                \t- Имя;
                \t- Отчество;
                \t- Дата рождения;
                \t- Номер телефона;
                \t- Пол.
                >>>\s""";
    }

    @Override
    public void start(List<String> data) throws DataRetrievalException {

        this.setData(data);
        View view = this.getView();
        try {
            view.request(this.getRequestText());
            data.clear();
            Collections.addAll(data, view.response().split(" "));
        } catch (ViewException exception) {
            throw new DataRetrievalException(exception);
        }

    }

}
