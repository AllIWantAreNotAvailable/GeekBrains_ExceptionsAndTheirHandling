package Application.View;

import Application.Exception.Application.ViewException;

/**
 * <p>Базовый интерфейс для элементов view-слоя приложения.
 * <p>Расширяет интерфейс {@link AutoCloseable}, что позволяет автоматически закрывать ресурсы представления.
 * <p>Определяет основные методы, необходимые для взаимодействия с пользовательским интерфейсом.
 * <p>Методы:
 * <li> {@link #request(String)}: отправляет запрос пользователю с указанным текстом.
 * <li> {@link #response()}: получает ответ пользователя на запрос.
 * <li> {@link #close()}: закрывает ресурсы представления.
 */
public interface View extends AutoCloseable {

    /**
     * Отправляет запрос пользователю с указанным текстом.
     *
     * @param text текст запроса, который будет отображен пользователю.
     * @throws ViewException если произошла ошибка при отправке запроса.
     */
    void request(String text) throws ViewException;

    /**
     * Получает ответ пользователя на запрос.
     *
     * @return ответ пользователя на запрос.
     * @throws ViewException если произошла ошибка при получении ответа.
     */
    String response() throws ViewException;

    /**
     * Закрывает ресурсы представления.
     *
     * @throws ViewException если произошла ошибка при закрытии ресурсов представления.
     */
    @Override
    void close() throws ViewException;

}
