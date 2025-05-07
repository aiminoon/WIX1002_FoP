package Viva_Thur.Q1;
  
public class Main {   
    public static void main(String[] args) {
        int rowCount = 5;
 
        for (int row = 1; row <= rowCount; row++) { 
          for (int space = 1; space <= rowCount - row; space++)
                System.out.print(" ");
            for (int decNum = row; decNum >= 1; decNum--)
              System.out.print(decNum);
            for (int incNum = 2; incNum <= row; incNum++)
                System.out.print(incNum);
            System.out.println();
        }
    }
}
