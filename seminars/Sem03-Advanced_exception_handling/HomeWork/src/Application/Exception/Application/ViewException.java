package Application.Exception.Application;

import Application.Exception.ApplicationException;

// JavaDoc
public class ViewException extends ApplicationException {

    public ViewException(Exception cause) {
        super("Ошибка пользовательского интерфейса:", cause);
    }

    public ViewException(String message, Exception cause) {
        super(message, cause);
    }

}
