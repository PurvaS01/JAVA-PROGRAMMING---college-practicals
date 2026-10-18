import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();

        l.add("C");
        l.add("Adv Py");
        l.add("LA");
        l.add("DS");

        System.out.println(l);
        l.remove(2);
        System.out.println(l);
        l.remove("DS");
        System.out.println(l);
        System.out.println(l.get(0));
        System.out.println(l.contains("C"));
        System.out.println(l.indexOf("C"));
    }
}
