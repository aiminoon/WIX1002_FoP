package week12;

public class TemporaryStaff extends ESS {
    public int workhour;
    
    public TemporaryStaff(String name, int wh) {
        this.name = name;        
        this.workhour = wh;
        this.type = "Temporary Staff" ;
    }
    public double getSalary() {
        return 15*workhour;
    } 
    
}
