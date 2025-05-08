package week12;

public class ContractStaff extends ESS{
    public double sales;
    
    public ContractStaff(String name, double s) {
        this.name = name;        
        this.sales = s;
        this.type = "Contract Staff" ;
    }
    public double getSalary() {
        return 500 + 0.5*sales;
    } 
    
}
