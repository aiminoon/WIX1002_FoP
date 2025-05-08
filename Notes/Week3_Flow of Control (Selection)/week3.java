import java.util.Random;

public class week3 {
    public static void main(String[] args) {
        Random r = new Random();
        final int MAX=100, DICE=6;
        
        //Determine whether a random number is greater than 50.
        /*
        int num=r.nextInt(MAX+1);
        if (num >50) {
            System.out.println(num + " is greater than 50");
        }
        else {
            System.out.println(num + " is lesser or equal to 50");
        }
        */
        
        //Two player dice game
        /*
        int p1 = r.nextInt(DICE) + 1, p2 = r.nextInt(DICE) + 1;
        System.out.println("Player 1 : " + p1 + " Player 2 : " + p2);
        if (p1>p2) {
            System.out.println("Player 1 WINS");            
        }
        else if (p2>p1) {
            System.out.println("Player 2 WINS");            
        }
        else {
            System.out.println("TIE");
        }
           
        //0 <= mark <= 100
        int mark = 123;
        if ( mark>=0 && mark<=100) {
            System.out.println(mark + " is valid");
        }
        else {
            System.out.println(mark + " is invalid");
        }
       
        //To get discount 
        //1. You are 50 years old and above.
        //2. You are female and purchase on Tuesday.
        //gender - 0 Male 1 Female, day 1 - Monday, 7 - Sunday
        
        int age=33, gender=1, day=2;
        if (age>=50 || (gender==1 && day==2) ) {
            System.out.println("Discount");
        }
        else { 
            System.out.println("No Discount");
        }
  
        
        // 1. Draw Pie Chart
        // 2. Draw Line Chart
        // 3. Draw Bar Chart
        // Inavlid choice
        int choice=2;
        switch (choice) {
            case 1:
                System.out.println("Draw Pie Chart 1");
                System.out.println("Draw Pie Chart 2");
                break;
            case 2:
                System.out.println("Draw Line Chart 1");
                System.out.println("Draw Line Chart 2");
                break;
            case 3:
                System.out.println("Draw Bar Chart");
                break;
            default:
                System.out.println("Invalid Choice");
        }        
        String uni1="UM", uni2="um";
        // if (uni1.equals(uni2)) {        
        if (uni1.equalsIgnoreCase(uni2)) {
            System.out.println("Same university");
        }
        else {
            System.out.println("Different university");
        }
       
        switch (uni1) {
            case "um" :
                System.out.println("UM");
                break;
            default:
                System.out.println("must be exactly the same");
        }
        */
        
        // sort 3 students matric in alphabet order
        String m1 = "U2001", m2 = "S1001", m3="U2771";
        
        if ( m1.compareTo(m2)<0 && m2.compareTo(m3)<0 ) {
            System.out.println(m1 + " " + m2 + " " + m3);
        }
        else if ( m1.compareTo(m3)<0 && m3.compareTo(m2)<0 ) {
           System.out.println(m1 + " " + m3 + " " + m2);
        }
        else if ( m2.compareTo(m1)<0 && m1.compareTo(m3)<0 ) {
           System.out.println(m2 + " " + m1 + " " + m3);
        }
        else if ( m2.compareTo(m3)<0 && m3.compareTo(m1)<0 ) {
           System.out.println(m2 + " " + m3 + " " + m1);
        }
        else if ( m3.compareTo(m1)<0 && m1.compareTo(m2)<0 ) {
           System.out.println(m3 + " " + m1 + " " + m2);
        }
        else {
           System.out.println(m3 + " " + m2 + " " + m1);
        }
        
        String v1="a", v2="A";
        if (v1.compareToIgnoreCase(v2)<0) {
            System.out.println(v1 + " " + v2);
        }
        else if (v2.compareToIgnoreCase(v1)<0){
            System.out.println(v2 + " " + v1);
        }
        else {
            System.out.println("Equal");
        }
        
    }
}
