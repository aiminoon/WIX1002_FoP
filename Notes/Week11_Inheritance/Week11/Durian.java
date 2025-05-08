
package week11;


public class Durian extends Fruit {
        private double weight;

    public Durian(double weight, String type) {
        super("Durian", type);
        this.weight = weight;
   }
    
    // A totalPrice method that returns the total price of the durian purchased.
    // The price of the D24 durian is RM24 per kilogram
    // The price of the Udang Merah durian is RM32 per kilogram
    
    public double totalPrice() {
        if (type.equals("D24")) {
            return 24*weight;
        }
        else if (type.equals("Udang Merah")) {
            return 32*weight;
        }
        else
            return 0;
    }

    public String toString() {
        return weight + " kg " + super.toString() + "Price : " + totalPrice() +"\n";                
    }
    
}
