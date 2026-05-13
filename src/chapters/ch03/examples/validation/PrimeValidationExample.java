import java.util.Scanner;

public class PrimeValidationExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isValid;
        int x;

        do {
            isValid = true;

            System.out.print("Please enter a positive prime integer less than 100:  ");
            x = input.nextInt();

            if (x <= 0 || x >= 100) {
                isValid = false;
            }

            if (!isPrime(x)) {
                isValid = false;
            }

            if (!isValid) {
                System.out.println("Invalid input.  Please try again.");
                System.out.println();
            }
        } while (!isValid);

        System.out.println("Correct!");
    }

    private static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }

        for (int divisor = 2; divisor * divisor <= x; divisor++) {
            if (x % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
