package Application.Model;

import Application.Exception.Application.ServiceException;

import java.util.List;

public interface Service {

    void start(List<String> data) throws ServiceException;

}
