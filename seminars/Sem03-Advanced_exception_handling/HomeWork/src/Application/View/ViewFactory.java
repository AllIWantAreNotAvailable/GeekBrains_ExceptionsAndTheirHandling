package Application.View;

import Application.Abstract.Factory;

public class ViewFactory implements Factory<BaseView> {

    private static BaseView view;

    private static BaseView getView() {
        if (ViewFactory.view == null) {
            ViewFactory.view = new TerminalView();
        }
        return ViewFactory.view;
    }

    @Override
    public BaseView create() {
        return ViewFactory.getView();
    }

}
