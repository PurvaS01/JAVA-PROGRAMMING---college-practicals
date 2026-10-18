class Main {
    public static void main(String[] args) {
        int x = 12;
        int y = 0;

        try {
            System.out.println(x / y);
            System.out.println("In between code");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally Executed");
        }
    }
}
