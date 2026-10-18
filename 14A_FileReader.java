import java.io.FileReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        try {
            int data;
            FileReader fr = new FileReader("SYIT.txt");

            while ((data = fr.read()) != -1) {
                System.out.println((char) data);
            }

            fr.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
