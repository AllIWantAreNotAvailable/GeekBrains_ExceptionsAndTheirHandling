package Application.Exception.Application;

import Application.Exception.ApplicationException;

public class ServiceException extends ApplicationException {

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Exception cause) {
        super(message, cause);
    }

}
