public class RemoveSpacesRunner {
    public static void main(String[] args) {
        RemoveSpaces obj = new RemoveSpaces();
        obj.setMainString("         MD    MAHIM   BABU   ");
        System.out.println(obj.trimmer());
        System.out.println(obj.replace());
    }
}
