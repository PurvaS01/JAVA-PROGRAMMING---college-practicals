import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("SYIT.txt");
            FileWriter fw = new FileWriter("TYIT.txt");
            int data;

            while ((data = fr.read()) != -1) {
                fw.write(data);
            }

            fr.close();
            fw.close();
            System.out.println("File Successfully Copied");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
