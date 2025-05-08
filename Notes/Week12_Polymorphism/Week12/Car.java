package week12;

public class Car extends Vehicle{
    private double price;
    public Car() {
        price =0;
    }
    public String toString() {
        return "This is a car object";
    } 
    
    public int getPrice() {
        return 150;
    }   
}
