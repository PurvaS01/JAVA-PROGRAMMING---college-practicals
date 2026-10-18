interface Greet {
    void disp(int n);
}

class Main {
    public static void main(String[] args) {
        Greet g = (n) -> System.out.println(n * n);
        g.disp(4);
    }
}
