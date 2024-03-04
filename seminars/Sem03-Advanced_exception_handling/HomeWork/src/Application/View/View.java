package Application.View;

import Application.Exception.Application.ViewException;

public interface View extends AutoCloseable {

    void request(String text) throws ViewException;

    String response() throws ViewException;

    @Override
    void close() throws ViewException;

}
