
package week11;


public class PartTimeStaff extends Staff {
    private int workhours;

    public PartTimeStaff(int workhours, String name, String ic) {
        super(name, ic);
        this.workhours = workhours;
    }    
   
    public int getSalary() {
        return 40*workhours;
    }
    
    public String toString() {
        return super.toString() + "Working Hours : " + workhours + "\nSalary : " + getSalary() +"\n";                
    }
    
}
