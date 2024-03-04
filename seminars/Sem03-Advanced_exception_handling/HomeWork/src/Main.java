import Application.Model.Application;
import Application.Controller.ApplicationController;
import Application.Exception.ApplicationException;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws ApplicationException {
        try (Application app = new ApplicationController(Arrays.asList(args))) {
            app.run();
        }
    }
}