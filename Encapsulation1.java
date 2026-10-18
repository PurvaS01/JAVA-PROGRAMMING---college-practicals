class Student {
    private int rollNo;
    private String name;

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name is: " + name);
    }

    public void put(int r, String n) {
        rollNo = r;
        name = n;
    }
}

class Encapsulation1 {
    public static void main(String[] args) {
        Student obj = new Student();

        obj.put(43, "Purva");
        obj.display();
    }
}
