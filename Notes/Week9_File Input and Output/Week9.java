package week9;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Week9 {

    public static void main(String[] args) {
        //System.out.println("Testing");
        /*
        // writing data to text file
        try {      
            PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));
            out.println("WIX1002");
            out.println("Overwrite");
            out.print(30 + " ");
            out.println(12.23);
            out.close();
            
            //adding data to the text file (append)
            PrintWriter out1 = new PrintWriter(new FileOutputStream("data.txt",true));
            out1.println("Programming added to the last line");
            out1.close();
            
        } catch (IOException e) {
            System.out.println("Problem with file output"); 
        }
        
        // reading data from text file
        try {
            Scanner in = new Scanner(new FileInputStream("data.txt"));
            while (in.hasNextLine()) {
               System.out.println(in.nextLine());
            }
            in.close();            
        } catch (FileNotFoundException e) {
            System.out.println("File was not found"); 
        }
        
        
        // write a program to store the exchange rate to the text file 
        // named currency.txt
        // USD 0.24 EUR 0.21 GBP 0.18 AUD 0.33 THB 7.90
         try {      
            PrintWriter a = new PrintWriter(new FileOutputStream("currency.txt"));
            a.println("USD 0.24");
            a.println("EUR 0.21");
            a.println("GBP 0.18");
            a.println("AUD 0.33");
            a.println("THB 7.90");
            a.close();
        } catch (IOException e) {
            System.out.println("Problem with file output"); 
        }
        // write a program to calculate the following 
        // The exchange rate is based on the currency.txt
        // RM5261 = USD
        // RM1134 = EUR
        // RM1000 = THB		
        System.out.printf("RM5261 - USD %.2f\n" , getCurrency(5261, "USD"));
        System.out.printf("RM1134 - EUR %.2f\n" , getCurrency(1134, "EUR"));
        System.out.printf("RM1000 - THB %.2f\n" , getCurrency(1000, "THB"));
        
        
        
        // writing data to binary file
        try {
            ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream("binary.dat"));
            out.writeInt(123);
            out.writeDouble(35.6789);
            out.writeChar('M');
            out.writeUTF("Welcome");
            out.close();
        } catch (IOException e) {
            System.out.println("Problem with file output.");
        }
        
        // reading data from binary file
        try {
            ObjectInputStream in = new ObjectInputStream (new FileInputStream("binary.dat"));
            System.out.println(in.readInt());
            System.out.println(in.readDouble());  
            System.out.println(in.readChar());
            System.out.println(in.readUTF());
            in.close();
         } catch (FileNotFoundException e) {
            System.out.println("File was not found"); 
         } catch (IOException e) {
            System.out.println("Problem with file input.");
         }
         */
        
        /*
        // generate N random numbers within 10-100, N is within (20-30) and then 
        // store in a binary file number.dat.
        int low=20, high=30, low1=10, high1=100;
        Random r = new Random();
        int N = r.nextInt(high-low+1) + low;
        try {
            ObjectOutputStream a = new ObjectOutputStream (new FileOutputStream("number.dat"));
            for(int i=0; i<N; i++) {
                a.writeInt(r.nextInt(high1-low1+1)+low1);
            }
            a.close();
        } catch (IOException e) {
            System.out.println("Problem with file output.");
        }
        
        // read all the random numbers from number.dat
        // display all the numbers, maximum and minimum
         try {
            ObjectInputStream in = new ObjectInputStream (new FileInputStream("number.dat"));
            int min = in.readInt();
            int max = min;
            System.out.print(min + " ");
            
            try {
                while(true) {
                    int num = in.readInt();
                    if (min>num){
                        min=num;
                    }
                    if (max<num){
                        max=num;
                    }
                    System.out.print(num + " ");
                }
            } catch (EOFException e) { }
            //int temp = in.readInt(); - for IOException
            in.close();
            System.out.println("\nMinimum Number : " + min);
            System.out.println("Maximum Number : " + max);
         } catch (FileNotFoundException e) {
            System.out.println("File was not found"); 
         } catch (IOException e) {
            System.out.println("Problem with file input.");
         }
        */
        /*
        // File Management
        File f = new File("d:\\fcsit\\data.txt");
        File f1 = new File("d:\\fcsit\\data1.txt");
        File f2 = new File("d:\\fcsit\\data2.txt");
        if (f.exists()) {
            System.out.println("The file is already exists");
            if (f.renameTo(f1)) {
                System.out.println("Rename file to data1.txt");
            }
        }
        if (f2.exists()) {
            if (f2.delete()) {
                System.out.println("Delete file");
            }
        }
        */
        
        // remove a record from a text file
        String code = "WMES1105";
        try {
            Scanner in = new Scanner(new FileInputStream("course.txt"));
            PrintWriter out = new PrintWriter(new FileOutputStream("temp.txt"));
            while (in.hasNextLine()) {
                String codefromtextfile = in.nextLine();
                if (code.equals(codefromtextfile)) {
                    in.nextLine();
                }
                else {
                    out.println(codefromtextfile);
                    out.println(in.nextLine());
                }
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found"); 
        } catch (IOException e) {
            System.out.println("Problem with file output"); 
        }
        // delete course.txt
        // rename temp.txt to course.txt
    }
    
    
    public static double getCurrency(int a, String b) {
        try {
            Scanner in = new Scanner(new FileInputStream("currency.txt"));
            while (in.hasNextLine()) {
                String[] str = in.nextLine().split(" ");
                if (str[0].equals(b)){
                    in.close();
                    return a*Double.parseDouble(str[1]);
                }
            }
            in.close();            
        } catch (FileNotFoundException e) {
            System.out.println("File was not found"); 
        }
        return 0.0;
    }
        
}
