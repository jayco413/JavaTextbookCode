import java.util.Scanner;

public class ValidatingInputLengthExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x;
        do {
            System.out.print("Enter a string: ");
            x = input.next();

            if (x.length() > 10) {
                System.out.println("Your string is too long, please try again.");
            }
        } while (x.length() > 10);

        System.out.println("x is valid!");
    }
}
