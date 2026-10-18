import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("SYIT.txt"));
            String s = "Now it works internal memory";

            bw.write(s);
            bw.close();
            System.out.println("Task done!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
