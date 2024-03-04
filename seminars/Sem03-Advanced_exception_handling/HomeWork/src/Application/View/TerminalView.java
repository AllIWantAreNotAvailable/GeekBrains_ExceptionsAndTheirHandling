package Application.View;

import Application.Exception.Application.ViewException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public class TerminalView extends BaseView {

    private static BufferedReader reader;

    protected BufferedReader getReader() {

        if (TerminalView.reader == null) {
            TerminalView.reader = new BufferedReader(new InputStreamReader(System.in));
        }
        return TerminalView.reader;

    }

    private String getExceptionPrefix() {
        return "Ошибка пользовательского интерфейса при попытке ";
    }

    @Override
    public void request(String text) throws ViewException {

        try {
            System.out.print(text);
        } catch (Exception exception) {
            throw new ViewException(this.getExceptionPrefix() + "вывода сообщения:", exception);
        }

    }

    @Override
    public String response() throws ViewException {

        try {
            return this.getReader().readLine();
        } catch (NoSuchElementException | IllegalStateException exception) {
            throw new ViewException(exception);
        } catch (Exception exception) {
            throw new ViewException(this.getExceptionPrefix() + "считать ввод пользователя:", exception);
        }

    }

    @Override
    public void close() throws ViewException {
        try {
            this.getReader().close();
        } catch (IllegalStateException exception) {
            throw new ViewException(exception);
        } catch (Exception exception) {
            throw new ViewException(this.getExceptionPrefix() + "закрыть поток ввода:", exception);
        }
    }

}
