class Student {
    int rollno;
    String name;

    Student() {
        rollno = 13;
        name = "Purva";
    }

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println("Roll No = " + rollno);
        System.out.println("Name = " + name);
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(24, "Siddhesh");

        s1.display();
        s2.display();
    }
}
