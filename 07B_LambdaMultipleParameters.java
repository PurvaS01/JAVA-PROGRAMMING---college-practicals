interface Greet {
    int disp(int x, int y);
}

class Main {
    public static void main(String[] args) {
        Greet g = (x, y) -> x + y;
        System.out.println(g.disp(4, 5));
    }
}
