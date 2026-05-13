import java.util.Random;

public class RandomRangeExample {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt();
        double randomDouble = random.nextDouble();
        int min = 1;
        int max = 10;
        int randomIntRange = random.nextInt(max - min + 1) + min;

        System.out.println("Random int: " + randomInt);
        System.out.println("Random double: " + randomDouble);
        System.out.println("Random int in range [1, 10]: " + randomIntRange);
    }
}
