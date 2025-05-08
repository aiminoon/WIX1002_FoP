package week12;

import java.util.Random;

public class Square implements Number, Comparable {
    private int num; 
    public int getRandom() {
        Random r = new Random();
        num =  r.nextInt(MAX-10+1) + 10;
        return num;
    }
    public boolean isEven(int a) {
        if (a%2==0)
            return true;
        else
            return false;
    }
    public int getNum() {
        return num;
    }
    
    public int compareTo(Object a) {
        if (num > ((Square)a).getNum()){
            return 1;
        } 
        else if (num < ((Square)a).getNum()){
            return -1;
        } 
        else
            return 0;
    }
    public String toString() {
       return "Random number is " + num + "\n" + "Even Number : "+ isEven(num) + "\n";               
    }
    
}
