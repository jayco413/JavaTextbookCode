import java.security.SecureRandom;

public class SecureRandomExample {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        int randomIntSecure = secureRandom.nextInt();
        double randomDoubleSecure = secureRandom.nextDouble();

        System.out.println("Secure random int: " + randomIntSecure);
        System.out.println("Secure random double: " + randomDoubleSecure);
    }
}
