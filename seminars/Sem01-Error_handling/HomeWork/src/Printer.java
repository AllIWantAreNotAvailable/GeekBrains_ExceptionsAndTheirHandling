import Tasks.Task01;
import Tasks.Task02;
import Tasks.Task03;

import java.util.Arrays;

public class Printer {
    public static void task01() {
        try {
            Task01.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            Task01.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            Task01.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }

    public static void task02() {
        int[] a = new int[]{4, 5, 6};
        int[] b = new int[]{1, 2, 3};

        Task02 task02 = new Task02();
        String itresume_res = Arrays.toString(task02.subArrays(a, b));
        System.out.println(itresume_res);
    }

    public static void task03() {
        int[] a = new int[]{12, 8, 16};
        int[] b = new int[]{4, 2, 4};

        Task03 task03 = new Task03();
        String itresume_res = Arrays.toString(task03.divArrays(a, b));
        System.out.println(itresume_res);
    }
}
