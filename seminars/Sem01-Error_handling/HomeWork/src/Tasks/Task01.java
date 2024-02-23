package Tasks;

public class Task01 {
    public static void arrayOutOfBoundsException() {
        // Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива.
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int num = arr[5];
    }

    public static void divisionByZero() {
        // Метод divisionByZero - Деление на 0.
        int dividend = 10;
        int divisor = 0;
        int quotient = dividend / divisor;
    }

    public static void numberFormatException() {
        // Метод numberFormatException - Ошибка преобразования строки в число.
        String string = "132klj";
        int num = Integer.parseInt(string);
    }
}
