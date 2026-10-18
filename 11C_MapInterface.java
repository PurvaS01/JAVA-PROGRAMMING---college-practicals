import java.util.*;

class Main {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();

        m.put(1, "Apple");
        m.put(2, "Ball");
        m.put(3, "Cat");
        m.put(4, "Dog");

        System.out.println(m);
        System.out.println(m.remove(2));
        System.out.println(m.containsKey(3));
        System.out.println(m.get(4));
    }
}
