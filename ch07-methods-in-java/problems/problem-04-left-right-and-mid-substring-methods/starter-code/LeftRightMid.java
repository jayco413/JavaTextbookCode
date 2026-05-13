/**
 * Demonstrates left, right, mid1, and mid2 substring-style methods.
 */
public class LeftRightMid {

    /**
     * Runs the fixed test program for the required methods.
     *
     * @param args unused command line arguments
     */
    public static void main(String[] args) {
        String s = "abcde";

        System.out.println("Test String: " + s);
        System.out.println();

        System.out.println("*** TEST OF LEFT METHOD ***");
        for (int i = 0; i <= 6; i++) {
            System.out.printf("left(\"%s\", %d) = %s%n", s, i, left(s, i));
        }
        System.out.println();

        System.out.println("*** TEST OF RIGHT METHOD ***");
        for (int i = 0; i <= 6; i++) {
            System.out.printf("right(\"%s\", %d) = %s%n", s, i, right(s, i));
        }
        System.out.println();

        System.out.println("*** TEST OF MID1 METHOD ***");
        for (int i = 1; i <= 6; i++) {
            System.out.printf("mid1(\"%s\", %d) = %s%n", s, i, mid1(s, i));
        }
        System.out.println();

        System.out.println("*** TEST OF MID2 METHOD ***");
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j <= 7 - i; j++) {
                System.out.printf("mid2(\"%s\", %d, %d) = %s%n", s, i, j,
                    mid2(s, i, j));
            }
        }
        System.out.println();
    }

    /**
     * Returns characters from the left side of the string.
     *
     * @param str the source string
     * @param length how many characters to return
     * @return the left substring
     */
    public static String left(String str, int length) {
        // YOUR CODE HERE
        return "";
    }

    /**
     * Returns characters from the right side of the string.
     *
     * @param str the source string
     * @param length how many characters to return
     * @return the right substring
     */
    public static String right(String str, int length) {
        // YOUR CODE HERE
        return "";
    }

    /**
     * Returns every character from the one-based start position to the end.
     *
     * @param str the source string
     * @param start the one-based start position
     * @return the substring from the starting position to the end
     */
    public static String mid1(String str, int start) {
        // YOUR CODE HERE
        return "";
    }

    /**
     * Returns a substring of the requested length from a one-based start.
     *
     * @param str the source string
     * @param start the one-based start position
     * @param length how many characters to return
     * @return the requested substring
     */
    public static String mid2(String str, int start, int length) {
        // YOUR CODE HERE
        return "";
    }
}
