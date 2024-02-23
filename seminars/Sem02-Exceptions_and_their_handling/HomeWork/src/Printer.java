import Tasks.Task01;
import Tasks.Task02;
import Tasks.Task03;
import Tasks.Task04;


public class Printer {
    public static void task01() {
        String input = "3.14"; // По умолчанию используем "3.14", если аргумент не передан

        float result = Task01.isFloat(input);
        System.out.println(result);
    }

    public static void task02() {
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int d = 1; // По умолчанию используем 0, если аргумент не передан

        double result = Task02.expr(intArray, d);
        System.out.println(result);
    }

    public static void task03() {
            int a = 90;
            int b = 3;

            double result = Task03.expr(a, b);
            System.out.println(result);
    }

    public static void task04() {
        char a = 'J';

        try {
            String result = Task04.expr(a);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}