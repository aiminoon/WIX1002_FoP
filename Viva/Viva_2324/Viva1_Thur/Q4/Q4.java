package Viva1_Thur.Q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String password = input.nextLine();

        boolean lowerCase = false;
        boolean upperCase = false;
        boolean specialChar = false;
        boolean digit = false;

        String specialCharacters = "!@#$%^&*()-+";
        
        stop: {
            if (password.contains(" ")) {
                System.out.println("Error: Input should not contain spaces.");
                break stop;
            } 
            
            for (char ch : password.toCharArray()) {
                if (Character.isLowerCase(ch)) {
                    lowerCase = true;
                } else if (Character.isUpperCase(ch)) {
                    upperCase = true;
                } else if (specialCharacters.contains(String.valueOf(ch))) {
                    specialChar = true;
                } else if (Character.isDigit(ch)) {
                    digit = true;
                }
            }
    
            if (lowerCase && upperCase && specialChar && digit && password.length() >= 8) {
                System.out.println("Strength of password: Strong");
            } else if (lowerCase && upperCase && specialChar && password.length() >= 6) {
                System.out.println("Strength of password: Moderate");
                if (digit == false)
                    System.out.println("Please add at least one digit.");
                if (password.length() < 8)
                    System.out.println("Please make your password at least 8 character.");
            } else {
                System.out.println("Strength of password: Weak");
                if (lowerCase == false) 
                    System.out.println("Please add at least one lowercase character.");
                if (upperCase == false) 
                    System.out.println("Please add at least one uppercase character.");
                if (specialChar == false) 
                    System.out.println("Please add at least one special characters: !@#$%^&*()-+ ");
                if (digit == false) 
                    System.out.println("Please add at least one digit.");
                if (password.length() < 6) 
                    System.out.println("Please make your password at least 8 character.");
            }
        }
    }
}
