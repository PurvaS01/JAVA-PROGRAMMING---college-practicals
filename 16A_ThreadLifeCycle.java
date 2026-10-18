class B {
    public void run() {
        System.out.println("Thread is running");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Thread is completed");
    }
}

class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.run();
    }
}
