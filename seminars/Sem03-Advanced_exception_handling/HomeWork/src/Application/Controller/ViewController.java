package Application.Controller;

import Application.Exception.Application.ViewException;
import Application.View.View;
import Application.View.ViewFactory;

public class ViewController implements View {

    private View view;

    public ViewController() {
        this(new ViewFactory().create());
    }

    public ViewController(View view) {
        this.setView(view);
    }

    public View getView() {
        return this.view;
    }

    public void setView(View view) {
        this.view = view;
    }

    @Override
    public void request(String text) throws ViewException {
        this.getView().request(text);
    }

    @Override
    public String response() throws ViewException {
        return this.getView().response();
    }

    @Override
    public void close() throws ViewException {
        this.getView().close();
    }

}
