class Gen<T> {
    T disp(T y) {
        return y;
    }
}

class Main {
    public static void main(String[] args) {
        Gen<Integer> g1 = new Gen<>();
        System.out.println(g1.disp(5));

        Gen<Double> g2 = new Gen<>();
        System.out.println(g2.disp(5.5));

        Gen<String> g3 = new Gen<>();
        System.out.println(g3.disp("SYIT"));
    }
}
