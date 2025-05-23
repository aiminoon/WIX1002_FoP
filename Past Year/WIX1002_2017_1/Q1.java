package WIX1002_2017_1;

import java.util.Scanner;

public class GraphsTest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number1 = 0, number2 = 0, number3 = 0, number4 = 0, number5 = 0;
            int inputNumber; // Number entered by user
            int value = 0; // Number of stars to print
            int counter = 1;
          
            while (counter <= 5) {
                System.out.print("Enter number: ");
                inputNumber = input.nextInt();
              
                if (inputNumber >= 1 && inputNumber <= 30) {
                    switch (inputNumber) {
                        case 1:
                            number1 = inputNumber;
                            break;
                        case 2:
                            number2 = inputNumber;
                            break;
                        case 3:
                            number3 = inputNumber;
                            break;
                        case 4:
                            number4 = inputNumber;
                            break;
                        case 5:
                            number5 = inputNumber;
                            break;
                    }
                    counter++;
                } else {
                    System.out.println("Invalid Input\nNumber should be between 1 and 30");
                }
            }

            for (counter = 1; counter <= 5; counter++) {
                value = switch (counter) {
                    case 1 -> number1;
                    case 2 -> number2;
                    case 3 -> number3;
                    case 4 -> number4;
                    case 5 -> number5;
                    default -> value;
                };
                for (int j = 1; j <= value; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
