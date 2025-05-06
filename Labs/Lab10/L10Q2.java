import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

class SubstitutionCiper implements MessageEncoder {
    private String inputFileName;
    private String outputFileName;
    private int shift;

    public SubstitutionCiper(String inputFileName, String outputFileName, int shift) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.shift = shift;
    }
    
    public String readFile() {
        String text = "";
        try{
            BufferedReader in = new BufferedReader(new FileReader("src/Lab10/" + inputFileName));
            text = in.readLine();
            in.close();
            return text;
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("Problem with input");
        }
        return text;
    }
    
    public void writeFile(String text) {
        try{
            BufferedWriter out = new BufferedWriter(new FileWriter("src/Lab10/" + outputFileName));
            out.write(text);
            System.out.println("File Written Successfully");
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("Problem with input");
        }
    }
    
    public void encode() {
        String text = readFile();
        encode(text);
    }
    
    public void encode(String plainText) {
        System.out.println("Plain Text: " + plainText);
        StringBuilder encryptedMessage = new StringBuilder();
        for(int i = 0; i < plainText.length(); i++) {
            // We take the char type - char type to get the difference of gap between character in ASCII code
            // Then the shift key is the gap that we want to achieve
            // We use modulus (%) 26 so that it won't exceed the aphabet range
            // Then we plus 'a' to jump from 'a' to the character that we want
            encryptedMessage.append((char)((plainText.charAt(i) - 'a' + shift) % 26 + 'a'));
        }
        System.out.println("Encrypted Text: " + encryptedMessage.toString());
        writeFile(encryptedMessage.toString());
    }
    
    public void decode() {
        String text = readFile();
        decode(text);
    }
    
    public void decode(String cipherText) {
        System.out.println("Cipher Text: " + cipherText);
        StringBuilder decryptedMessage = new StringBuilder();
        for(int i = 0; i < cipherText.length(); i++) {
            // Decrypt is the same with encrypt but different direction
            // Hence 26 - shift key is the different direction
            decryptedMessage.append((char)((cipherText.charAt(i) - 'a' + (26 - shift)) % 26 + 'a'));
        }
        
        System.out.println("Decrypted Text: " + decryptedMessage.toString());
        writeFile(decryptedMessage.toString());
    }
}

public class L10Q2 {
    public static void main(String[] args) {
        MessageEncoder encrypt = new SubstitutionCiper("messageSend.txt", "messageReceived.txt", 3);
        encrypt.encode();
        MessageEncoder decrypt = new SubstitutionCiper("messageReceived.txt", "messageSend.txt", 3);
        decrypt.decode();
    }
}
