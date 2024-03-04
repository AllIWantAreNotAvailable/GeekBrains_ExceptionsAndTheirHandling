package Application.Model;

import Application.Exception.ApplicationException;

public interface Application extends AutoCloseable {

    boolean isStartupParameters();

    void run() throws ApplicationException;

    @Override
    void close() throws ApplicationException;

}
