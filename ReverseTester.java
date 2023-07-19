public class ReverseTester {
    public static void main(String[] args)
    {
        StringBuilder str = new StringBuilder("desserts");
        System.out.println("String = "+ str.toString());
        StringBuilder reverseStr = str.reverse();
        System.out.println("Reverse String = "+ reverseStr.toString());
    }
}
