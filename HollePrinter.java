public class HollePrinter {
    private String str;

    public HollePrinter(String str) {
        this.str = str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String replace(char output, char input){
        String newString = str.replace(output,input);
        return newString;
    }
}
