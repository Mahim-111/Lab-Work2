public class StringReplaceRunner {
    public static void main(String[] args) {

        StringReplace obj = new StringReplace();
        System.out.println(obj.getStateName());
        System.out.println(obj.replaceI());
        obj.setStateName(obj.replaceI());
        System.out.println(obj.replaceSS());
        System.out.println(obj.calculateLength(obj.replaceSS()));

    }
}
