package Application.Model;

import Application.Exception.Application.Service.DataSaverException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

/**
 * <p>Класс для сохранения данных пользователя в файл формата *.txt.
 * Реализует функционал интерфейсов {@link Service} и {@link AutoCloseable}.
 * <li>Имя файла формируется на основе фамилии пользователя, без учета склонения фамилии.
 * <li>Если у нескольких пользователей одинаковая фамилия, их данные будут записаны в один файл.
 * <li>Данные пользователя записываются в файл с новой строки.
 */
public class DataSaverService extends BaseModel implements Service, AutoCloseable {

    private BufferedWriter writer;

    /**
     * Возвращает объект для записи данных в файл.
     *
     * @return объект {@link BufferedWriter} для записи данных.
     */
    public BufferedWriter getWriter() {
        return this.writer;
    }

    /**
     * Устанавливает объект для записи данных в файл.
     *
     * @param writer объект {@link BufferedWriter} для записи данных.
     */
    public void setWriter(BufferedWriter writer) {
        this.writer = writer;
    }

    /**
     * <p>Сервис для записи данных пользователя в локальный файл.
     * Записывает данные пользователя в файл с форматом *.txt.
     *
     * @param data список строк данных пользователя.
     * @throws DataSaverException если произошла ошибка при сохранении данных в файл.
     */
    @Override
    public void start(List<String> data) throws DataSaverException {
        try {
            String fileName = data.getFirst() + ".txt";
            this.setWriter(new BufferedWriter(new FileWriter(fileName, true)));
            BufferedWriter writer = this.getWriter();
            writer.write(String.join(" ", data));
            writer.newLine();
        } catch (Exception exception) {
            throw new DataSaverException(exception);
        }
    }

    /**
     * Закрывает поток записи данных в файл.
     *
     * @throws DataSaverException если произошла ошибка при закрытии потока записи в файл.
     */
    @Override
    public void close() throws DataSaverException {
        try {
            this.getWriter().close();
        } catch (Exception exception) {
            throw new DataSaverException(exception);
        }
    }

}
