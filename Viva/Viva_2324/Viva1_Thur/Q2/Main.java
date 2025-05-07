package Viva_Thur.Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, remainder, reverse = 0;

        System.out.print("Enter an Integer: ");
        number = input.nextInt();

        while ( number  != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("Reversed Integer: " + reverse);
    }
}
