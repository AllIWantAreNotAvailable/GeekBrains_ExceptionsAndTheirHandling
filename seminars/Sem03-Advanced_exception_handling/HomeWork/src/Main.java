import Application.Controller.ApplicationController;
import Application.Exception.ApplicationException;
import Application.Model.Application;

import java.util.Arrays;

/**
 * Release v1.0: Implemented MVC architecture, Singleton pattern for view layer, data validation, and file saving
 * service. Added input data parsing, error handling, and file writing functionality. Fixed minor bugs and improved
 * user input validation. Updated documentation.
 * <p>
 * Точка входа в приложение.
 * <p>
 * Этот класс представляет собой точку входа в приложение. Он создает объект {@link ApplicationController},
 * передает в него аргументы командной строки и вызывает метод {@link Application#run()} для запуска приложения.
 * После завершения работы приложения используется конструкция try-with-resources для автоматического закрытия
 * ресурсов.
 * </p>
 * <p>
 * Приложение запрашивает у пользователя следующие данные, разделенные пробелом:
 * </p>
 * <li>Фамилия;
 * <li>Имя;
 * <li>Отчество;
 * <li>Дата рождения;
 * <li>Номер телефона;
 * <li>Пол.
 * <br>
 * <br>
 * <p>
 * Данные вводятся в установленных форматах.
 * </p>
 * <br>
 * <p>
 * Приложение выполняет следующие действия:
 * </p>
 * <li>Проверяет введенные данные по количеству: если количество не совпадает, возвращает код ошибки,
 * обрабатывает его и показывает пользователю сообщение о неверном количестве данных.
 * <li>Распарсивает введенную строку и выделяет требуемые значения. Если форматы данных не совпадают,
 * выбрасывает исключение, соответствующее типу проблемы.
 * <li>Создает файл с названием, равным фамилии. В файл записываются полученные данные в виде одной строки.
 * Однофамильцы записываются в один и тот же файл в отдельные строки.
 * <li>Закрывает соединение с файлом. При возникновении проблем с чтением-записью в файл, исключение
 * корректно обрабатывается, пользователь уведомляется стектрейсом ошибки.
 */
public class Main {

    public static void main(String[] args) throws ApplicationException {
        try (Application app = new ApplicationController(Arrays.asList(args))) {
            app.run();
        }
    }

}