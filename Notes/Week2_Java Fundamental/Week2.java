package week2;

import java.util.Random;
import java.util.Scanner;

public class Week2 {

    public static void main(String[] args) {
        // single line comment
        /*
            multiple lines Comment

        */
        // declare variable (without value)
        /*
        int num;
        num = 1000;
        char letter;
        letter = 65;
        System.out.println(num);
        System.out.println(letter);
        
        // initiliase variable (with value)
        char letter1 = 'A';
        System.out.println(letter1);

        // constant variable
        int a = 1000;
        final int MAX = a;    
        a = 200;
        System.out.println(MAX);
       
        // Arithmetic Operator  
        int num1=20, num2=3;
        System.out.println(num1/num2);
        System.out.println(num1 / (double) num2);
        System.out.println(num1/ (num2*1.0) );
        
        int num3 = 6;
        int num4 = num3++;
        System.out.println(num4);
        
        int num5 = 6;
        int num6 = ++num5;
        System.out.println(num6);
        
        String name1 = "Ang";
        String name2 = "Tan Fong";
        System.out.println(name1 + " " + name2);
        */
        
        // Console Input
        /*
        Scanner s = new Scanner(System.in);
        double temperature;
        System.out.print("Enter temperature : ");
        temperature = s.nextDouble();
        System.out.println("Temperature : " + temperature);       
        s.nextLine(); //remove enter buffer
        
        String coursename;
        System.out.print("Enter course name : ");
        coursename = s.nextLine();
        System.out.println("Course name : " + coursename);
        */
        
        // Console Output
        /*
        double num1=20, num2=3;
        System.out.printf("%.3f\n", num1/num2);
        
        String course = "WIX1002";
        System.out.printf("%-20s\n", course);
        
        String name1 = "Ang";
        String name2 = "Tan Fong";
        System.out.printf("%s %s\n", name1, name2);    
        
        System.out.printf("%-20s%s\n", "apple", "orange");
        System.out.printf("%c %c\n", 90, 'M');
        */
        
        // Random Number
        Random r = new Random();
        System.out.println(r.nextInt());
        System.out.println(r.nextDouble());
        // random number 0-1000
        int num8 = r.nextInt(1001);
        
        // random number 30-100
        int low=30, high=100;
        int num9 = r.nextInt(high-low+1) + low;
        System.out.println(num9);
      
        // random number - double 0 - 100 
        double num10 = r.nextDouble()*100; 
        System.out.printf("%.2f\n", num10);
 
        // random number double 30-100
        
    }
    
}
