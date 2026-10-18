interface I<T> {
    void disp(T x);
}

class Gen implements I<Integer> {
    public void disp(Integer y) {
        System.out.println(y);
    }
}

class Main {
    public static void main(String[] args) {
        Gen g = new Gen();
        g.disp(8);
    }
}
