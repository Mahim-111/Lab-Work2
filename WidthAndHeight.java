
import java.awt.Rectangle;
public class WidthAndHeight {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(5, 5, 6, 7);
        Rectangle rec2 = new Rectangle(10, 10, 9, 12);
        System.out.println( rec1.getWidth() +" " +rec1.getHeight());
        System.out.println(+ rec2.getWidth() + " "+ rec2.getHeight());
    }
}

