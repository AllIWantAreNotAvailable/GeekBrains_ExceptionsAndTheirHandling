package Tasks;

public class Task01 {
    public static float isFloat(String input) {
        float num = Float.NaN;
        try {
            num = Float.parseFloat(input);
        } catch (NumberFormatException exception) {
            System.out.println("Your input is not a float number. Please, try again.");
        }
        return num;
    }
}
