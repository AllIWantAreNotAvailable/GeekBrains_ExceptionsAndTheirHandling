package Application.Model;

import Application.Exception.Application.ServiceException;

import java.util.List;

/**
 * <p>Интерфейс, представляющий сервисы приложения.
 * <p>Сервисы выполняют определенные задачи или операции в приложении.
 */
public interface Service {

    /**
     * Метод, запускающий сервис с заданными данными.
     *
     * @param data список строк данных, необходимых для выполнения сервиса.
     * @throws ServiceException если происходит ошибка при выполнении сервиса.
     */
    void start(List<String> data) throws ServiceException;

}
