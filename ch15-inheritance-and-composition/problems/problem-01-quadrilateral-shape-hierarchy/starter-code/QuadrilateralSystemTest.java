/**
 * QuadrilateralSystemTest class to represent different types of quadrilaterals,
 * and test their properties such as area and perimeter.
 */
public class QuadrilateralSystemTest {
    public static void main(String[] args) {
        Quadrilateral quadrilateral = new Quadrilateral(
            new double[] {3.61, 4.47, 4.47, 5},
            new double[] {93.18, 97.12, 90, 79.70}
        );
        System.out.println("Quadrilateral Area: " + quadrilateral.getArea());
        System.out.println("Quadrilateral Perimeter: " + quadrilateral.getPerimeter());

        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        Square square = new Square(4);
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());

        // The textbook test program also references Rhombus, Parallelogram,
        // and Trapezoid implementations that students are expected to add.
    }
}
