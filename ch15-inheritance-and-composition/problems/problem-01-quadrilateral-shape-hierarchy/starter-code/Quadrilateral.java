/**
 * Class representing a quadrilateral shape, providing methods for
 * manipulating its sides and angles, and computing the area.
 */
public class Quadrilateral {
    private double[] sides;
    private double[] angles;

    /**
     * Constructs a quadrilateral with empty data.
     */
    public Quadrilateral() {
        sides = new double[4];
        angles = new double[4];
    }

    /**
     * Constructs a quadrilateral with given sides and angles.
     *
     * @param sides Array of four side lengths.
     * @param angles Array of four angles in degrees.
     */
    public Quadrilateral(double[] sides, double[] angles) {
        if (sides.length != 4 || angles.length != 4) {
            throw new IllegalArgumentException("Quadrilateral requires 4 sides and 4 angles.");
        }
        this.sides = sides.clone();
        this.angles = angles.clone();
    }

    public void setSide(int sideNum, double sideValue) {
        if (sideNum < 0 || sideNum > 3) {
            throw new IllegalArgumentException("sideNum must be between 0 and 3.");
        }
        sides[sideNum] = sideValue;
    }

    public void setAngle(int angleNum, double angleValue) {
        if (angleNum < 0 || angleNum > 3) {
            throw new IllegalArgumentException("angleNum must be between 0 and 3.");
        }
        angles[angleNum] = angleValue;
    }

    public double getArea() {
        // ADD YOUR CODE HERE, USE BRETSCHNEIDER'S FORMULA
        return 0.0;
    }

    public double getPerimeter() {
        // ADD YOUR CODE HERE
        return 0.0;
    }
}
