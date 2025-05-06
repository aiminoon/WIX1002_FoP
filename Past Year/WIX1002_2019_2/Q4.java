package WIX1002_2019_2;

public class Q4 {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(Pizza.LARGE, 1, 1, 1);
        System.out.println(pizza);
    }
}

class Pizza {
    public static final String SMALL = "SMALL";
    public static final String MEDIUM = "MEDIUM";
    public static final String LARGE = "LARGE";

    private String size;
    private int numOfCheeseTopping;
    private int numOfBeefTopping;
    private int numOfChickenTopping;

    public Pizza() {
    }

    public Pizza(String size, int numOfCheeseTopping, int numOfBeefTopping, int numOfChickenTopping) {
        this.size = size;
        this.numOfCheeseTopping = numOfCheeseTopping;
        this.numOfBeefTopping = numOfBeefTopping;
        this.numOfChickenTopping = numOfChickenTopping;
    }

    public String getSize() {
        return size;
    }

    public int getNumOfCheeseTopping() {
        return numOfCheeseTopping;
    }

    public int getNumOfBeefTopping() {
        return numOfBeefTopping;
    }

    public int getNumOfChickenTopping() {
        return numOfChickenTopping;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setNumOfCheeseTopping(int numOfCheeseTopping) {
        this.numOfCheeseTopping = numOfCheeseTopping;
    }

    public void setNumOfBeefTopping(int numOfBeefTopping) {
        this.numOfBeefTopping = numOfBeefTopping;
    }

    public void setNumOfChickenTopping(int numOfChickenTopping) {
        this.numOfChickenTopping = numOfChickenTopping;
    }

    public double computeCost() {
        int basePrice = SMALL.equals(size) ? 10 : MEDIUM.equals(size) ? 12 : 14;
        return basePrice + (numOfCheeseTopping + numOfBeefTopping + numOfChickenTopping) * 2;
    }

    @Override
    public String toString() {
        return String.format("Pizza (%s)\nCheese Topping: %d\nBeef Topping: %d\nChicken Topping: %d\nPrice: %.2f",
                size, numOfCheeseTopping, numOfBeefTopping, numOfChickenTopping, computeCost());
    }
}
