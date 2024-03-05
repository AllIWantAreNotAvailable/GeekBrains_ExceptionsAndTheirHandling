package Application.Controller;

import Application.Exception.Application.ViewException;
import Application.View.View;
import Application.View.ViewFactory;

/**
 * Класс-контроллер для управления view-слоем приложения.
 * Реализует интерфейс {@link Application.View.View}.
 */
public class ViewController implements View {

    private View view;

    /**
     * Конструктор без параметров, создает экземпляр класса {@link Application.View.View} с использованием фабрики.
     */
    public ViewController() {
        this(new ViewFactory().create());
    }

    /**
     * Конструктор с параметром, устанавливает предоставленный объект в качестве view.
     *
     * @param view объект view для управления
     */
    public ViewController(View view) {
        this.setView(view);
    }

    /**
     * Получение объекта view, с которым ведется взаимодействие.
     *
     * @return объект view
     */
    public View getView() {
        return this.view;
    }

    /**
     * Установка объекта view для управления.
     *
     * @param view объект view
     */
    public void setView(View view) {
        this.view = view;
    }

    /**
     * Отправляет запрос пользователю через view.
     *
     * @param text текст запроса
     * @throws ViewException если возникает ошибка при отправке запроса
     */
    @Override
    public void request(String text) throws ViewException {
        this.getView().request(text);
    }

    /**
     * Получает ответ пользователя через view.
     *
     * @return ответ пользователя
     * @throws ViewException если возникает ошибка при получении ответа
     */
    @Override
    public String response() throws ViewException {
        return this.getView().response();
    }

    /**
     * Закрывает view.
     *
     * @throws ViewException если возникает ошибка при закрытии view
     */
    @Override
    public void close() throws ViewException {
        this.getView().close();
    }

}
