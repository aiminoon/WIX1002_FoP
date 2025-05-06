import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class L7Q3 {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("src/Lab7/order.txt"));
            PrintWriter out = new PrintWriter(new FileOutputStream("src/Lab7/reverse.txt"));
            String line;
            while ((line = in.readLine()) != null) {
                StringBuilder reverseBuilder = new StringBuilder(line);
                String reversedStr = reverseBuilder.reverse().toString();
                out.println(reversedStr);
            }
            
            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println("Error with file input");
        }
    }
}
