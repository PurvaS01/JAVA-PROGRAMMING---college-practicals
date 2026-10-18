class A {
    int r;
}

class B extends A {
    void show() {
        System.out.println(r * r);
    }
}

class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.r = 5;
        obj.show();
    }
}
