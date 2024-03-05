package Application.View;

import Application.Abstract.Factory;

/**
 * <p>Фабрика для создания объектов представления ({@link BaseView}) приложения.
 * <p>Реализует паттерн Singleton, чтобы гарантировать, что только один экземпляр
 * представления будет создан и использован во всем приложении.
 */
public class ViewFactory implements Factory<BaseView> {

    private static BaseView view;

    /**
     * Возвращает единственный экземпляр представления.
     * Если экземпляр не был создан ранее, создает новый экземпляр {@link TerminalView}.
     *
     * @return экземпляр представления.
     */
    @Override
    public BaseView create() {
        if (ViewFactory.view == null) {
            ViewFactory.view = new TerminalView();
        }
        return ViewFactory.view;
    }

}
