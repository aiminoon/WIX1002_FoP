import java.util.Scanner;

public class L2Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in gram: ");
        int m = input.nextInt();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialTemp = input.nextDouble();
        initialTemp = (initialTemp - 32) / 1.8;
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalTemp = input.nextDouble();
        finalTemp = (finalTemp - 32) / 1.8;
        
        // Convert to kg
        int M = m / 1000;
        
        double Q = M * (finalTemp - initialTemp) * 4184;
        System.out.printf("The energy needed is %e%n", Q);        
        input.close();
    }
}
