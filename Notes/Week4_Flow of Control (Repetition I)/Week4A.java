package week4a;

import java.util.Random;
import java.util.Scanner;

public class Week4A {
 
    public static void main(String[] args) {
       /* Count=Controlled
       // dislay I like Java Programming for 5 times
       for(int i=1; i<=5; i++) {
           System.out.println("I like Java Programming");
       }
       
       // display chart Jan - 1400, Feb - 2300  (1 $ = 100) 
       System.out.print("Jan - ");
       for(int i=1; i<=14; i++) {
           System.out.print("$");
       }
       System.out.print("\nFeb - ");
       for(int i=1; i<=23; i++) {
           System.out.print("$");
       }
       System.out.println(); 

       // display 10 Random number (0-100)
       final int MAX=100;
       Random r = new Random();
       for(int i=1; i<=10; i++) {
           System.out.print(r.nextInt(MAX+1) + " ");
       }
       System.out.println();  
       */
       /* Sentinel-Controlled
       // Request the user to enter matric number, EXIT to quit       
       Scanner s = new Scanner(System.in);       
       String matric="";
       while( !matric.equals("EXIT") ) {
           System.out.print("Enter matric number : ");
           matric=s.nextLine();
       }       
       // Request the user to enter positive integer, negative number to quit       
       int num;
       do {
            System.out.print("Enter positive integer : ");
            num = s.nextInt();
       } while(num>=0);
       */
       
       /* break and continue
       // generate random number (0-10) and add to the total
       // if the total>30, stop the loop
       // display all the random number whereby the sum of these numbers <= 30
       final int MAX=10;
       Random r= new Random();
       int num, total=0;       
       while (total<=30) {
           num =r.nextInt(MAX+1);
           total+=num;
           if (total>30) {              
              break;
           }
           System.out.print(num + " ");
       }
       System.out.println("\nTotal " + total);
          
       // generate 5 random number (0-100), display the even number only       
       final int MAX1=100;
       for(int i=1; i<=5; i++) {
           num =r.nextInt(MAX1+1);
           if (num%2==1) {
               continue;
           }
           System.out.print(i + ". " + num + " ");
       }
       System.out.println();

               
       // display 5 random even number only (0-100)
       Random r= new Random();
       int num; 
       final int MAX1=100;
       for(int i=1; i<=5; ) {
           num =r.nextInt(MAX1+1);
           if (num%2==1) {
               continue;
           }
           System.out.print(num + " ");
           i++;
       }
       System.out.println();
        */
              
       // Print the minimum number from 10 random numbers (0-100)
       /*
       Random r= new Random();
       final int MAX1=100;
       int num, min;
       min = r.nextInt(MAX1+1);
       System.out.print(min + " ");
       for(int i=1; i<10; i++) {
           num = r.nextInt(MAX1+1);
           System.out.print(num + " ");
           if (num<min) {
               min = num;
           }
       }
       System.out.println("\nThe minimum number is " + min);
       */
       
       // Print the number of odd and even number from 10 random numbers/
       // The random number must be from 10 – 50.
       /*
       Random r= new Random();
       final int MIN2=10, MAX2=50;
       int num, numOfOdd=0, numOfEven=0;
       
       for(int i=1; i<=10; i++) {
           num = r.nextInt(MAX2-MIN2+1) + MIN2;
           System.out.print(num + " ");
           if (num%2==1) {
               numOfOdd++;
           }
           else {
               numOfEven++;
           }   
       }
       System.out.println("\nThe number of Odd Number : " + numOfOdd);
       System.out.println("The number of Even Number : " + numOfEven);
       */
       stop: {
           for(int i=1; i<=10; i++) {
               for(int j=1; j<=10; j++) {
                   if (j==3) {
                       System.out.println("break");
                       break stop;
                   } 
               }
           }
       }
       /*
       for( ; ; ) {
       
       }
       while (true) {
           
       }
       */
    }
    
}
