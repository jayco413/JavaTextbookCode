public class CharArrayDemo {
    public static void main(String[] args) {
        String str = "Hello World!";
        char[] charArray = str.toCharArray();
        System.out.println("The string is: " + str);
        System.out.print("The character array is: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}
