package week12;

public class PermanentStaff extends ESS{
    private String category;

    public PermanentStaff(String name, String category) {
        this.name = name;        
        this.category = category;
        this.type = "Permanent Staff" ;
    }
    public double getSalary() {
        switch (category) {
            case "A":
                return 4000;
            case "B":
                return 3000;
            case "C":
                return 2000;
            default:
                return 0;    
        }
    } 
   
}
