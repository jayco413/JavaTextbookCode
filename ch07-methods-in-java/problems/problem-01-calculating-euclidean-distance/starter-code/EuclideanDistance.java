import java.util.Scanner;

/**
 * This class computes the Euclidean distance between two points in
 * n-dimensional space.
 */
public class EuclideanDistance {

    /**
     * Reads two points and prints the Euclidean distance between them.
     *
     * @param args unused command line arguments
     */
    public static void main(String[] args) {
        double[] point1;
        double[] point2;

        System.out.print("How many dimensions? ");
        Scanner input = new Scanner(System.in);
        int dimensions = input.nextInt();
        point1 = new double[dimensions];
        point2 = new double[dimensions];

        System.out.print("Enter first point: ");
        for (int i = 0; i < point1.length; i++) {
            point1[i] = input.nextDouble();
        }

        System.out.print("Enter second point: ");
        for (int i = 0; i < point2.length; i++) {
            point2[i] = input.nextDouble();
        }

        System.out.printf("Euclidean distance: %.2f",
            euclideanDistance(point1, point2));
    }

    /**
     * Returns the Euclidean distance between two points.
     *
     * @param point1 the first point
     * @param point2 the second point
     * @return the distance between the points
     */
    private static double euclideanDistance(double[] point1, double[] point2) {
        // YOUR CODE HERE
        return 0.0;
    }
}
