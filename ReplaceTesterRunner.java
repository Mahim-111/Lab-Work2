public class ReplaceTesterRunner {
    public static void main(String[] args) {
        ReplaceTester newString = new ReplaceTester();
        String updateIString = newString.replaceI();
        newString.setStr(updateIString);
        System.out.println(newString.replaceS());
    }
}
