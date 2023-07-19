public class StringReplace {

    private  String stateName;
    public StringReplace(){
        stateName = "Mississippi";
    }
    public StringReplace(String stateName) {
        this.stateName = stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateName() {
        return stateName;
    }
    public String replaceI() {
        String newStateName = stateName.replace("i","ii") ;
        return newStateName;
    }
    public String replaceSS() {
        String newStateName = stateName.replace("ss","s");
        return newStateName;
    }
    public int calculateLength(String name) {
        return name.length();
    }
}
