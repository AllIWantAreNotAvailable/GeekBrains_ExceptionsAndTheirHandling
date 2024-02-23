package Tasks;

public class Task03 {

    public static double expr(int a, int b) {
        double quotient = 0.0d;
        if (b == 0) {
            System.out.println("It's not possible to evaluate the expression - a / b as b = 0.");
        } else {
            quotient = a / (double) b;
        }
        if (quotient != 0.0d) printSum(a, b);
        return quotient;
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

}
