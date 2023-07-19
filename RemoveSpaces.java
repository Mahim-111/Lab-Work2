public class RemoveSpaces {

    private String mainString;
    public void setMainString(String mainString) {
        this.mainString = mainString;
    }
    public String trimmer(){
        return mainString.trim();
    }

    public String replace() {
        String newString = mainString.replace(" ","");
        return newString;
    }

}
