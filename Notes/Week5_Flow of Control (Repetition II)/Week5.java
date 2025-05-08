package week5;

import java.util.Random;
import java.util.Scanner;

public class Week5 {
    public static void main(String[] args) {
        /*
        Scanner s = new Scanner(System.in);
        int X, Y;
        String move;
        System.out.print("Enter the coordinate X and Y: ");
        X = s.nextInt();
        Y = s.nextInt();
        // remove enter key
        s.nextLine();
        System.out.print("Enter the Move: ");
        move = s.nextLine();
        System.out.println("Initial Coordinate (" + X + "," + Y + ")");
        for(int i=0; i<move.length(); i++) {
            switch (move.charAt(i)) {
                case 'L' :
                    X--;
                    break;
                case 'R' :
                    X++;
                    break;   
                case 'U' :
                    Y++;
                    break;
                case 'D' :
                    Y--;
                    break;
            }
        }
        System.out.println("Final Coordinate (" + X + "," + Y + ")");
        */
        /*
        Scanner s = new Scanner(System.in);
        String durian;
        double sales;
        double total=0.0;
        do {
            System.out.print("Enter the type of Durian [Quit] to terminate : ");
            durian = s.nextLine();  
            if (durian.equals("Quit"))
                break;
            System.out.print("Enter the sales in kg : ");
            sales = s.nextDouble();
            // remove enter key
            s.nextLine();
            if (durian.equals("MK")) {
                total += sales * 25;
            }
            else if (durian.equals("HL")) {
                total += sales * 22;
            }
            else if (durian.equals("D24")) {
                total += sales * 20;
            }
            else if (durian.equals("UM")) {
                total += sales * 18;
            }
        } while(!durian.equals("Quit"));
        
        System.out.printf("Total Sales : %.2f\n", total);
        */
        /*
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int N, SID, low=10000, high=99999, count = 0;
        System.out.print("Enter the number of staff [N] : ");
        N= s.nextInt();
        for(int i=0; i<N; i++) {
            SID = r.nextInt(high-low+1) + low;
            System.out.println("Staff ID : " + SID);
            if ( (SID%10000/1000)%2==1 && (SID%100/10)%2==0 ) {
                System.out.println("Weekend Duty");
                count++;
            }
            else {
                System.out.println("Weekend Off");
            }
        }
        System.out.println("The number of staffs work during weekend is " + count);
        */
        Scanner s = new Scanner(System.in);
        int num, factor,correct=0, count=0;
        boolean ans;
        do {
            System.out.print("Enter a number (-1 to quit) : ");
            num = s.nextInt();
            if (num==-1) {
                break;
            }
            System.out.print("Enter a factor : ");
            factor = s.nextInt();
            System.out.print(factor + " is a factor of " + num + "? (true/false) : ");
            ans = s.nextBoolean();
            if ( (num%factor==0) == ans) {
                System.out.println("Your answer is correct.");
                correct++;
            }
            else {
                System.out.println("Your answer is incorrect.");
            }
            count++;
        }while(!(num==-1));

        System.out.println("The final score is " + correct + "/" + count);   
    }
    
}
