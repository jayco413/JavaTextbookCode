import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String line = scanner.next();

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.print("Enter a double: ");
        double decimal = scanner.nextDouble();

        System.out.print("Enter a boolean: ");
        boolean bool = scanner.nextBoolean();

        System.out.println("You entered: " + line);
        System.out.println("You entered: " + number);
        System.out.println("You entered: " + decimal);
        System.out.println("You entered: " + bool);
    }
}
