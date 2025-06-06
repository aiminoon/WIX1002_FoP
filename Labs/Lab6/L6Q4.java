public class L6Q4 {
    public static void main(String[] args) {
        System.out.println("GCD of 24 and 8 is " + euclideanGCD(24, 8));
        System.out.println("GCD of 200 and 645 is " + euclideanGCD(200, 645));
    }
    
    public static int euclideanGCD(int a, int b) {
        int max, min;
        if (a > b) {
            max = a; 
            min = b;
        } else {
            min = a;
            max = b;
        }
        
        System.out.println(max + ", " + min);
        
        // Ending condition
        if(max % min == 0)
            return min;
        
        // Recursive call
        return euclideanGCD(min, max%min);
    }
}
