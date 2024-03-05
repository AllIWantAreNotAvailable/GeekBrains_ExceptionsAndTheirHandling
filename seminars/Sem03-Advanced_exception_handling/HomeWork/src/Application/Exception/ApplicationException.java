package Application.Exception;

/**
 * Базовое исключение, используемое для представления непредвиденных ошибок приложения.
 */
public class ApplicationException extends Exception {

    /**
     * Создает новое исключение с указанным сообщением.
     *
     * @param message сообщение об ошибке
     */
    public ApplicationException(String message) {
        this(message, null, false, true);
    }

    /**
     * Создает новое исключение с указанным сообщением и причиной.
     *
     * @param message сообщение об ошибке
     * @param cause   причина исключения
     */
    public ApplicationException(String message, Exception cause) {
        this(message, cause, true, true);
    }

    /**
     * Создает новое исключение с указанной причиной.
     *
     * @param cause причина исключения
     */
    public ApplicationException(Exception cause) {
        this("Непредвиденная ошибка приложения:", cause, true, true);
    }

    /**
     * Создает новое исключение с указанным сообщением, причиной и другими настройками.
     *
     * @param message            сообщение об ошибке
     * @param cause              причина исключения
     * @param enableSuppression  определяет, может ли исключение подавляться или нет
     * @param writableStackTrace определяет, должен ли стек вызовов быть записан в исключении
     */
    public ApplicationException(String message, Exception cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
