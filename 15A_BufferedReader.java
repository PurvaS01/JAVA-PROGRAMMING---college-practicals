import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("SYIT.txt"));
            String s;

            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }

            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
