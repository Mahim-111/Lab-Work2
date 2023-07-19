import java.util.Random;

public class RandomPrice {
    public static void main(String[] args) {
        Random randomPrice = new Random();
        System.out.println(randomPrice.nextDouble() * (19.95 - 10.00) + 10.00);
    }

}
