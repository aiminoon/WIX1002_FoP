import java.util.Random;
import java.util.Scanner;

public class Week6 {

    public static void main(String[] args) {
        
//        //declare array
//        int size=100;
//        int[] num = new int[size];
//        num[0] = 12;
//        num[num.length-1] = 89;     //num[99] = 89; num[size-1] = 89
//        System.out.println("First : " + num[0] + " Last : " + num[num.length-1]);
        
//        // initialise array
//        char[] symbol = {'$', '%', '+', '-'};
//        symbol[2] = '*';
//               
//        // display all the elements of the array
//        for(int i=0; i<symbol.length; i++) {
//            System.out.print(symbol[i] + " ");
//        }
//        System.out.println();
//        for (char value : symbol) {
//             System.out.print(value + " ");
//        }
//        System.out.println();
//        
        
//        // update all the elements of the array
//        Random r = new Random();
//        final int MAX=100;
//        int size = 20;
//        int[] num = new int[size];
//        for(int i=0; i<num.length; i++) {
//            num[i] = r.nextInt(MAX+1);            
//        }
//        for(int i=0; i<num.length; i++) {
//            System.out.print(num[i] + " ");
//        }
//        System.out.println();
      
//        // Display the number of female student from a random list of 100 students.
//        // char M = Male, F = Female
//        
//        Random r = new Random();
//        int size = 100;
//        char[] gender = {'M', 'F'};
//        char[] student = new char[size];
//        for(int i=0; i<student.length; i++) {
//            student[i] = gender[r.nextInt(2)];            
//        }
//        int cntFemale=0;
//        for(int i=0; i<student.length; i++) {
//            if (student[i]=='F') {
//                cntFemale++;
//            }            
//        }
//        System.out.println("The number of Female Student : " + cntFemale);
        
//        // Split a String
//        String str = "Ang,Tan,Fong,Ahmad,Ali";
//        String[] info = str.split(",");
//        for(String value : info) {
//            System.out.println(value );
//        }
//        System.out.println();
        
        
//        //Multidimensional Array
//        char[][] symbol = { {'*','/','%'}, {'+', '-', '='} };
//        for(int i=0; i<symbol.length; i++) {        //symbol.length = size of row 
//            for(int j=0; j<symbol[i].length; j++) { //symbol[i].length = size of column 3
//                System.out.print(symbol[i][j] + "  ");
//            }
//            System.out.println();
//        }
                
        
//        // Linear Search
//        Scanner s = new Scanner(System.in);
//        Random r = new Random();
//        final int MAX=100;
//        int size = 20;
//        int[] num = new int[size];
//        for(int i=0; i<num.length; i++) {
//            num[i] = r.nextInt(MAX+1); 
//            System.out.print(num[i] + " ");
//        }
//        System.out.print("\nEnter number to search : ");
//        int key = s.nextInt();
//        boolean search=false;
//        for(int i=0; i<num.length; i++) {
//            if (key==num[i]) {
//                System.out.println("Found in position " + i);
//                search =true;
//                break;
//            }
//        }
//        if (!search) {
//            System.out.println("Not Found");
//        }

        
        // Bubble Sort
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        final int MAX=100;
        int size = 20;
        int[] num = new int[size];
        
        for(int i=0; i<num.length; i++) {
            num[i] = r.nextInt(MAX+1); 
            System.out.print(num[i] + " ");
        }
        System.out.println("\nBubble Sort");        
        for(int pass=0; pass<num.length-1; pass++) { 
           for (int i = 0; i <num.length - 1 - pass; i++) {
              if (num[i] > num[i+1])  {
                 int hold = num[i];        
		 num[i] = num[i+1];  
		 num[i+1] = hold;
	      }
           }
        }
        for(int i=0; i<num.length; i++) {
            System.out.print(num[i] + " ");
        }    


        // Binary Search  
        System.out.print("\nEnter number to search : ");
        int key = s.nextInt();
        boolean search=false;

        // Binary Search        
        int low = 0;  
        int high = num.length - 1; 
        int middle;    
        while ( low <= high ) {
            middle = ( low + high ) / 2;
	    if ( key == num[middle]) {
                System.out.println("Found in position " + middle);
                search = true;
                break;
            } 
            else if ( key < num[middle] )
                high = middle - 1;  
	    else
                low = middle + 1;   
        }
        if (!search) {
            System.out.println("Not Found");
        }
        
        // Book Title
        
    }
    
}
