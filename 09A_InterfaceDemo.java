interface D {
    void show();
}

class B implements D {
    public void show() {
        System.out.println("Hello from Interface D");
    }
}

class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
