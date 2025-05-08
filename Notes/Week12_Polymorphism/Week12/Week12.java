package week12;

public class Week12 {

    public static void profile(Vehicle a) {
        System.out.println(a.toString());
        System.out.println("The price is " + a.getPrice());
    }
    
    public static void main(String[] args) {
        /*
        // System.out.println("Polymorphism - Dynamic Binding");
        // System.out.println("Abstract Class and Interface");
        
        // abstract class - Vehicle -> child class Boat and Car
        Boat b = new Boat();
        Car c = new Car();
        profile(b);
        profile(c);
        
        Vehicle d = b; // can create object to refer to child 
        // Vehicle v = new Vehicle(); cannot create vehicle object using new
    
        // interface Number
        // Cube implements Number
        Cube a = new Cube();
        System.out.println(a.toString());
        // Square implements Number, Comparable
        
        Square s1 = new Square();
        Square s2 = new Square();
        s1.getRandom();
        s2.getRandom();
        
        if (s1.compareTo(s2)>0) {
            System.out.println(s2.getNum() + " " + s1.getNum());
        }
        else {
            System.out.println(s1.getNum() + " " + s2.getNum());
        }
        
       // Create an Employee Salary System. 
       // The system will display the employee name, employee type 
       // and total salary per month. 
       // A permanent employee is divided into three categories. 
       // A is 4000, B is 3000 and C is 2000. 
       // A contract staff has a fixed monthly income of 500 
       // and a commission of 50% of the total sales. 
       // A temporary staff is given 15 per hour work. 
       // Create one abstract base class and three derived class for the system.
       // Create a Tester class to test the program.
       
       PermanentStaff p1 = new PermanentStaff("John", "B");
       ContractStaff p2 = new ContractStaff("Ahmad", 4000);
       TemporaryStaff p3 = new TemporaryStaff("Lim", 40);
       
       System.out.println(p1.toString());
       System.out.println(p2.toString());
       System.out.println(p3.toString());
  */      
       // try-catch-finally statement 
       int num=13;
       try {
           // define the condition to throw exception
           // throw new Exception
           if (num>10) {
               throw new Exception("Cannot call the test method");
           }
           else if (num%2==0) {
               // throw new AngException();
               throw new AngException("Cannot be even number");
           }
           special(4,0);
           test(num);
       } catch (Exception e) {
            System.out.println(e.getMessage());
       } finally { 
           // close file, close database connection
           System.out.println("This code always run");
       }
       
    }    
    
    // pre condition a<=10
    public static void test(int a) {
        System.out.println(a);
    }
    // exception in Method  
    public static int special(int a, int b) throws ArithmeticException {
        return a/b;
    }
    
}
