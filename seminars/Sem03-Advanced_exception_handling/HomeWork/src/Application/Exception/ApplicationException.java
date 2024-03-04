package Application.Exception;

// TODO JavaDoc
public class ApplicationException extends Exception {

    public ApplicationException() {
        this("Приложение неожидано завершило работу из-за непредвиденной ошибки.");
    }

    public ApplicationException(String message) {
        this(message, null, false, true);
    }

    public ApplicationException(String message, Exception cause) {
        this(message, cause, true, true);
    }

    public ApplicationException(Exception cause) {
        this("Непредвиденная ошибка приложения:", cause, true, true);
    }

    public ApplicationException(String message, Exception cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}