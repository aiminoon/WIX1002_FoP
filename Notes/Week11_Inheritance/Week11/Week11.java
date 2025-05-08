package week11;

public class Week11 {

    public static void main(String[] args) {
        // System.out.println("Inheritance - Code Reuse");
        /*
        // Parent Class, Base Class, Superclass
        // Child Class, Derived Class, Subclass        
        // Parent class - Father (name, houseaddress, car)
        // Child class - Son (name), stay at same house, can use the car.
        Father a = new Father ("John", "KL", "Toyota");
        System.out.println(a.toString());
        Son b = new Son("John", "KL", "Toyota", "Ang");
        System.out.println(b.toString());
        */

        
        // Problem 1:
        // Design a Fruit class that consists of the following members:
        // A field for the name of the fruit.
        // A field for the type of the fruit.
        // constructor that contains the name and type of the fruit.
        // Accessor method for the name and type of the fruit.
        // A method that displays the fruit's type and name.
        
        // Design an Apple class that extends the Fruit class. 
        // A field for the quantity of the apple
        // A constructor
        // A totalPrice method that returns the total price of the apple purchased
        // Green apple is RM9.80 (5 pcs) 
        // Red apple is RM6.40 (5 pcs) 
        // A method that displays the quantity and total price of the apple purchased.
                      
        // Design a Durian class that extends the Fruit class. 
        // A field for the weight of the durian in kilogram.
        // A constructor
        // A totalPrice method that returns the total price of the durian purchased.
        // The price of the D24 durian is RM24 per kilogram
        // The price of the Udang Merah durian is RM32 per kilogram
        // A display method that displays the weight and total price of the durian purchased.
        
        // Ahmad purchased the following items:
        // 23 green apple, 36 red apple and 4.6kg D24 durian 
        // and 3.2kg Udang Merah durian
        // display all items purchased and total price.
        
        Apple a1 = new Apple(23, "Green");
        Apple a2 = new Apple(36, "Red");
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        Durian d1 = new Durian(4.6, "D24");
        Durian d2 = new Durian(3.2, "Udang Merah");
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        
        
        //Problem 2
        // Design a Staff class that consists of the following members:
        // A field for the name of the staff.
        // A field for the IC of the staff.
        // A constructor that contains all the above fields.
        // A toString method that displays the staff’s name and IC.

        // Design a PermanentStaff class that extends the Staff class. 
        // The PermanentStaff class has the following members:
        // A field for the grade of the staff.
        // A constructor with arguments.
        // A getSalary method that computes salary based on the table below.
        // grade "A01" - RM2000
        // grade "A02" - RM2500
        // A toString method that displays the staff’s grade and salary.
        
        PermanentStaff p1 = new PermanentStaff("A02", "Abdul Razak", "871001-14-1765");
        System.out.println(p1.toString());
        
        // Design a class PartTimeStaff that extends the Staff class. 
        // The PartTimeStaff class has the following members:
        // A field for the number of working hours (integer type).
        // A constructor with arguments.
        // A getSalary method that computes salary based on RM40 per hour.
        // A toString method that displays the staff’s working hours and salary.
        
         PartTimeStaff p2 = new PartTimeStaff(35, "Tengku Ali", "911223-08-3301"); 
         System.out.println(p2.toString());
         
         SpecialStaff p3 = new SpecialStaff("John", "1234-1234");
         System.out.println(p3.toString());
         
         // getClass()
         if (d1.getClass()==d2.getClass()){
             System.out.println("The objects are belongs to same clas");      
         }
         else {
             System.out.println("The objects are not belongs to the same class");   
         }
         
         // instanceof 
         if (d1 instanceof Fruit) {
             System.out.println("The object is one of the type of any descendent class of Fruit");   
         }
         if (d1 instanceof Durian) {
             System.out.println("The object is one of the type of any descendent class of Durian");   
         }

        
         
    }
    
}
