package week12;

public abstract class ESS {
    protected String name, type;
    
    public String toString() {
        return name + " (" + type + ") - Salary is " + getSalary();
    }
    
    public abstract double getSalary();
    
    
}
