
import java.awt.Rectangle;

public class AreaTester {
    public static void main(String[] args) {
            Rectangle rectangle = new Rectangle(0,0, 5,9);
            double area = rectangle.getWidth() * rectangle.getHeight();
            System.out.println(area);
    }
}
