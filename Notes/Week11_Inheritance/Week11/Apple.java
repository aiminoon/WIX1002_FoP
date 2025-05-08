package week11;


public class Apple extends Fruit{
    
    private int quantity;

    public Apple(int quantity, String type) {
        super("Apple", type);
        this.quantity = quantity;
    }
    
    // A totalPrice method that returns the total price of the apple purchased
    // Green apple is RM9.80 (5 pcs), Red apple is RM6.40 (5 pcs) 
    
    public double totalPrice() {
        if (type.equals("Green")) {
            return 9.80/5*quantity;
        }
        else if (type.equals("Red")) {
            return 6.40/5*quantity;
        }
        else
            return 0;
    }

    public String toString() {
        return quantity + " x " + super.toString() + "Price : " + totalPrice() +"\n";                
    }
    
}
