abstract class A {
    abstract void show();

    void disp() {
        System.out.println("Hi");
    }
}

class B extends A {
    void show() {
        System.out.println("Hello");
    }
}

class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.disp();
    }
}
