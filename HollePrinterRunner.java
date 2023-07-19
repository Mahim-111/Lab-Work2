public class HollePrinterRunner {
    public static void main(String[] args) {
        HollePrinter obj = new HollePrinter("\"Hello,World!\"");

        String changeString = obj.replace('e','x');

        obj.setStr(changeString);

        changeString = obj.replace('o','e');

        obj.setStr(changeString);

        changeString = obj.replace('x','o');

        System.out.println(changeString);

    }
}
