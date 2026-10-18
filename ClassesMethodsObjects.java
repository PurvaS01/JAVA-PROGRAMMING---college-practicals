class Student {
    int rollNo;
    String name;

    void show(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println("Roll No = " + rollNo);
        System.out.println("Name = " + name);
    }
}

class ClassesMethodsObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.show(10, "Purva");
        s2.show(20, "Siddhesh");

        s1.display();
        s2.display();
    }
}
