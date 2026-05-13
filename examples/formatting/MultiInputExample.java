import java.util.Scanner;

public class MultiInputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter two integers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("You entered: " + num1 + " " + num2);
    }
}
