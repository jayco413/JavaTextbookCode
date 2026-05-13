import java.util.Scanner;

/**
 * Demonstrates triangle-area calculation in three-dimensional space.
 */
public class TriangleAreaCalculator {

    /**
     * Reads three points and prints the triangle area.
     *
     * @param args unused command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first point (x, y, z): ");
        int[] point1 = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

        System.out.print("Enter second point (x, y, z): ");
        int[] point2 = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

        System.out.print("Enter third point (x, y, z): ");
        int[] point3 = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

        System.out.printf("The area of the triangle is: %.2f%n",
            getAreaOfTriangle(point1, point2, point3));
    }

    /**
     * Returns the area of the triangle formed by the three points.
     *
     * @param pt1 the first point
     * @param pt2 the second point
     * @param pt3 the third point
     * @return the triangle area
     */
    public static double getAreaOfTriangle(int[] pt1, int[] pt2, int[] pt3) {
        // YOUR CODE HERE
        return 0.0;
    }

    /**
     * Returns the Euclidean distance between two 3D points.
     *
     * @param point1 the first point
     * @param point2 the second point
     * @return the distance between the points
     */
    public static double euclideanDistance(int[] point1, int[] point2) {
        // YOUR CODE HERE
        return 0.0;
    }

    /**
     * Returns the triangle area using Heron's formula.
     *
     * @param side1 the first side length
     * @param side2 the second side length
     * @param side3 the third side length
     * @return the triangle area
     */
    public static double heronsFormula(double side1, double side2, double side3) {
        // YOUR CODE HERE
        return 0.0;
    }
}
