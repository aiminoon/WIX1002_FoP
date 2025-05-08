package week12;

public class Boat extends Vehicle {
    private double price;
    public Boat() {
        price =0;
    }
    public String toString() {
        return "This is a boat object";
    }    
    public int getPrice() {
        return 250;
    } 
}
