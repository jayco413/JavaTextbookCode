public class InfiniteWhileLoopExample {
    public static void main(String[] args) {
        int i = 0;

        while (i < 10) {
            System.out.println("This loop never updates i.");
            break;
        }
    }
}
