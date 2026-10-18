import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);

            System.out.println("Enter Roll No:");
            int roll = s.nextInt();
            s.nextLine();

            System.out.println("Enter your Name:");
            String name = s.nextLine();

            FileWriter fw = new FileWriter("Student.txt");
            fw.write("Roll no: " + roll + "\n");
            fw.write("Name: " + name);
            fw.close();
            s.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
