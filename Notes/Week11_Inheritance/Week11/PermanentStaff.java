
package week11;

public class PermanentStaff extends Staff {
   private String grade;

    public PermanentStaff(String grade, String name, String ic) {
        super(name, ic);
        this.grade = grade;
    }
   
    public int getSalary() {
        if (grade.equals("A01")) {
            return 2000;
        }
        else if (grade.equals("A02")) {
            return 2500;
        }
        else
            return 0;
    }
    
    public String toString() {
        return super.toString() + "Grade : " + grade + "\nSalary : " + getSalary() +"\n";                
    }
    
}
