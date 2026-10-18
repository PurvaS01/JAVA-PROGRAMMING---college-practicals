class Gen<T> {
    T x;

    void disp(T y) {
        x = y;
        System.out.println(x);
    }
}

class Main {
    public static void main(String[] args) {
        Gen<Integer> g1 = new Gen<>();
        g1.disp(5);

        Gen<Double> g2 = new Gen<>();
        g2.disp(5.5);

        Gen<String> g3 = new Gen<>();
        g3.disp("SYIT");
    }
}
