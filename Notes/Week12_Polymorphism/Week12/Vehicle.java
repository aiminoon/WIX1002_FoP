
package week12;

public abstract class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract String toString();
    public abstract int getPrice();    
}
