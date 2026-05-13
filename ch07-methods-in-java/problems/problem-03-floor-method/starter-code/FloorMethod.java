import java.util.Scanner;

/**
 * Demonstrates rounding a number down to the nearest multiple.
 */
public class FloorMethod {

    /**
     * Reads a number and a multiple, then prints the floored result.
     *
     * @param args unused command line arguments
     */
    public static void main(String[] args) {
        double number;
        double multiple;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = input.nextDouble();
        System.out.print("Enter multiple: ");
        multiple = input.nextDouble();
        System.out.printf("Result: %.2f", floor(number, multiple));
    }

    /**
     * Returns the largest multiple less than or equal to the number.
     *
     * @param number the number to round down
     * @param multiple the multiple to use
     * @return the floored result
     */
    private static double floor(double number, double multiple) {
        // YOUR CODE HERE
        return 0.0;
    }
}
