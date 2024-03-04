package Application.Model;

import Application.Exception.Application.ServiceException;
import Application.Exception.Application.ViewException;

import java.util.Deque;
import java.util.List;

public interface Service {

    void start(List<String> data) throws ServiceException;

}
