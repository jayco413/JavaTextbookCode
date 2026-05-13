import java.util.Scanner;

public class InfiniteForLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            System.out.println("You entered: " + num);
        }
    }
}
