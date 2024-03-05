package Application.Model;

import Application.Exception.ApplicationException;

/**
 * Базовый интерфейс для приложения.
 * Расширяет интерфейс {@link AutoCloseable}.
 */
public interface Application extends AutoCloseable {


    /**
     * Проверяет наличие параметров запуска приложения.
     *
     * @return {@code true}, если параметры запуска есть, в противном случае {@code false}.
     */
    boolean isStartupParameters();

    /**
     * Запускает приложение.
     *
     * @throws ApplicationException если произошла ошибка при выполнении приложения.
     */
    void run() throws ApplicationException;

    /**
     * Закрывает ресурсы приложения.
     *
     * @throws ApplicationException если произошла ошибка при закрытии ресурсов.
     */
    @Override
    void close() throws ApplicationException;

}
