package Tasks;

public class Task02 {

    public static double expr(int[] intArray, int d) {

        double quotient = Double.NaN;

        if (intArray.length < 9) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / " +
                    "d as there is no 8th element in the given array.");
        } else if (d == 0){
            System.out.println("It's not possible to evaluate the expression - intArray[8] / " +
                    "d as d = 0.");
        } else {
            quotient = intArray[8] / (double) d;
            System.out.printf("intArray[8] / d = %d / %d = %.1f%n", intArray[8], d, quotient);
        }

        return quotient;
    }
}
