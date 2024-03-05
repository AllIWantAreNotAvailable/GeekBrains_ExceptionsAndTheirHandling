package Application.Model;

import Application.Exception.Application.Service.DataSaverException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class DataSaverService extends BaseModel implements Service, AutoCloseable {

    private BufferedWriter writer;

    public BufferedWriter getWriter() {
        return this.writer;
    }

    public void setWriter(BufferedWriter writer) {
        this.writer = writer;
    }

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

    @Override
    public void close() throws DataSaverException {
        try {
            this.getWriter().close();
        } catch (Exception exception) {
            throw new DataSaverException(exception);
        }
    }

}
