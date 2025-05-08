package week11;

public class Son extends Father {
    private String name;
    
    public Son(String fname, String addr, String car, String name) {
        super(fname, addr, car);
        this.name = name;
    }

    public String toString() {       
        return "My name is  " + name + "\n" + super.toString() + "\n" +
               "I can use my parent car " + car;
    }
    
}
