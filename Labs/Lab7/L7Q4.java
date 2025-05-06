import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class L7Q4 {
    public static void main(String[] args) {
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        
        try {
            BufferedReader in = new BufferedReader(new FileReader("src/Lab7/lecturer.txt"));
            String line;
            while ((line = in.readLine()) != null) {
                charCount += line.length();
                
                String[] words = line.split("\\s+");
                wordCount += words.length;
                
                lineCount++;
            }
            
            System.out.println("Number of char: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of line: " + lineCount);
            
        } catch (IOException e) {
            System.out.println("Error with file input");
        }
    }
}
