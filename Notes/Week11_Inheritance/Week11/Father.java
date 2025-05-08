
package week11;


public class Father {
    private String name, houseaddress;
    protected String car;
      
    public Father(String name, String houseaddress, String car) {
        this.name = name;
        this.houseaddress = houseaddress;
        this.car = car;
    }

    public String toString() {
        return "Father : " +  name + "\nHouse Address : " + houseaddress + 
               "\nCar : " + car + "\n";
    }
    
}
