
package week11;


public class Fruit {
    private String name;
    protected String type;

    public Fruit(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return type + " " + name + "\n";
    }
    
    
}
