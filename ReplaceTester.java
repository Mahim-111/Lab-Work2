public class ReplaceTester {
    private String str;
    public ReplaceTester(){
        str = "Mississippi";
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String replaceI(){
        String newString = str.replace("i","!");
        return newString;
    }
    public String replaceS(){
        String newString = str.replace("s","$");
        return newString;
    }
}
