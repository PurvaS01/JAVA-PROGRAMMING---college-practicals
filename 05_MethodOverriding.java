class A {
    public void show() {
        System.out.println("Hi");
    }
}

class B extends A {
    public void show() {
        System.out.println("Hello");
    }
}

class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
