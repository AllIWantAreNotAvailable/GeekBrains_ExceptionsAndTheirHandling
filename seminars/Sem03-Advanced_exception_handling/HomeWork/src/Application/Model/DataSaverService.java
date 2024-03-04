package Application.Model;

import Application.Exception.Application.Service.DataSaverException;
import Application.Exception.Application.ServiceException;

import java.util.List;

public class DataSaverService extends BaseModel implements Service, AutoCloseable {

    @Override
    public void start(List<String> data) throws ServiceException {

    }

    @Override
    public void close() throws DataSaverException {

    }

}
