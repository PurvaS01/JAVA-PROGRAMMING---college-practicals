import java.util.*;

class Main {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();

        s.add("C");
        s.add("Adv Py");
        s.add("LA");
        s.add("DS");

        System.out.println(s);
        s.remove("C");
        System.out.println(s);
        System.out.println(s.contains("C"));
        System.out.println(s.size());
    }
}
