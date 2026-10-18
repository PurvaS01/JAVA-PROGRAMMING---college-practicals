import java.util.Scanner;

class Practical01A_TerminalInputOutput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = s.nextLine();

        System.out.println("Enter Roll No:");
        int rollNo = s.nextInt();

        System.out.println("Name = " + name + ", Roll No = " + rollNo);

        s.close();
    }
}
