package Viva1_Thur.Q3;

import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in); 
        
        System.out.print("Enter a number: "); 
        int userNum = k.nextInt(); 
        
        if (!isStrongNum(userNum) || userNum == 0){  // Calls isStrongNum method to check if the input number is strong number or not 
            System.out.println(userNum + " is not a strong number"); 
        } else {
            System.out.println(userNum + " is a strong number");
        }
    }
    
    public static int calcFactorial(int num) {    // Used static for both methods because they belong to the StrongNumber class itself
        int factorial = 1; 
        for (int i = 1; i <= num; i++) {
            factorial *= i;   // Calculates factorial 
        }
        return factorial; 
    }
    
    public static boolean isStrongNum(int num) {
        int inputNum = num; // To save num in a different variable so that when we compare with sum, we use original value before it was altered 
        int sum = 0; 
        while (num > 0) {
            int eachDigit = num % 10; // Saves each digit of the input from left to right
            sum += calcFactorial(eachDigit); // Adds factorial of each digit to sum by calling isFactorial method 
            num /= 10; // Truncates used digit 
        }
        return sum == inputNum; 
    }
}
