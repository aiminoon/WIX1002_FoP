package week12;

import java.util.Random;

public class Cube implements Number {
    
    public int getRandom() {
        Random r = new Random();
        return r.nextInt(MAX+1);
    }
    public boolean isEven(int a) {
        if (a%2==0)
            return true;
        else
            return false;
    }
    public String toString() {
        int a = getRandom();
        return "Random number is " + a + "\n" + "Even Number : "+ isEven(a) + "\n";               
    }
}
