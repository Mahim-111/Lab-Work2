import java.awt.Point;

public class PointTester {
    public static void main(String[] args) {
        Point firstPoint = new Point();
        Point secondPoint = new Point();

        firstPoint.setLocation(3,4);
        secondPoint.setLocation(-3,-4);

        double distance = firstPoint.distance(secondPoint);
        System.out.println(distance);

    }
}
