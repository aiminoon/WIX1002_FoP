package Viva2_Thur.Q1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter password: ");
        String password = input.nextLine();
      
        if (passwordCheck(password) == true)
            System.out.println("Valid password!");
        else
            System.out.println("Invalid password!");
    }
  
    public static boolean passwordCheck(String letters) {
        boolean lowerCase = false;
        boolean upperCase = false;
        boolean specialChar = false;
        boolean digit = false;
        int digitCount = 0, specialCount = 0;
        String specialCharacters = "`~!@#$%^&*()-_\\=+[{]}|;:'\",<.>/?";
      
        for (char characters : letters.toCharArray()) {
            if (Character.isLowerCase(characters))
            lowerCase = true;
            if (Character.isUpperCase(characters))
            upperCase = true;
            if (Character.isDigit(characters))
            digitCount++;
            if (specialCharacters.contains(String.valueOf(characters)))
            specialCount++;
        }
      
        if (digitCount >=3)
            digit = true;
        if (specialCount == 1)
            specialChar = true;
        else
            specialChar = false;
      
        if (lowerCase && upperCase && digit && specialChar && letters.length() >= 8)
            return true;
        else
            return false;
    }
}
