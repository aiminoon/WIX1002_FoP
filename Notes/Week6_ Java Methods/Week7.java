package week7;

import java.util.Random;

public class Week7 {
    public static void main(String[] args) {
        
        // methods without return value
        String a = "os.version";
        String name = "user.dir";
        version();
        info("os.name");
        info(a);
        info(name);
        
//        square();
//        square(8, 12);
        
//        //check precondition here before calling the method
//        //square(p,q)
//        int x=10, y=50, n=5;
//        randomnumber(n,x,y);

//        
//        // methods with return value
//        String str="Welcome UM";
//        System.out.print("The number of alphabet U and M in " + str + " is ");
//        // System.out.println(getAlphabetUM(str));
//        int result = getAlphabetUM(str);
//        System.out.println(result);
//     
//        System.out.println("Perimeter of Rectangle " + getPerimeter(3.5,5.2));
//        System.out.println("Perimeter of Circle " + getPerimeter(4.2));
//
//        
//        
        // pass by value
        int num = 10;
        special(num);
        System.out.println(num);
//        
//        // reference type - array
//        int[] original = {1,2,3,4,5};
//        special(original);
//        System.out.println(original[1]);
//        
//        int[] newnum = original;
//        newnum[1]=88;
//        System.out.println(original[1]);
//        
//        //how to make a copy in array?
//        int[] copyoriginal = original.clone();
//        copyoriginal[4] =100;
//        System.out.println(original[4]);
//        
        int N=10;
        int[] number = new int[N];        
        int cntodd = getOdd(number, 10, 50);
        System.out.print("The random numbers are : ");
        for(int value : number) {
            System.out.print(value + " ");
        }
        System.out.println("\nThe number of odd number is " + cntodd);
        
//        int[] cntoddeven = getOddEven(number, 10, 50);
//        System.out.print("The random numbers are : ");
//        for(int value : number) {
//            System.out.print(value + " ");
//        }
//        System.out.println("\nThe number of odd number is " + cntoddeven[0]);        
//        System.out.println("The number of even number is " + cntoddeven[1]);       
    }
    
    
    // display Java Version no parameter
    public static void version() {
        System.out.println(System.getProperty("java.version"));
    }
        
    // display Java System Properties - one parameter
    public static void info(String name) {
        System.out.println(System.getProperty(name));
    }
    
    // display square number from 1 - 10
    public static void square() {
        final int MAX=10;
        for(int i=1; i<=MAX; i++) {
            System.out.print(i*i + " ");
        }
        System.out.println("");        
    }
    
    // display square number from A - B (A and B are the parameters)
    // precondition : A < B
    public static void square(int A, int B) {
        for(int i=A; i<=B; i++) {
            System.out.print(i*i + " ");
        }
        System.out.println("");
    }
    
    // precondition : A < B, N>=1
    // postcondition: display N random number from A - B (N, A and B are parameters)
    public static void randomnumber(int N, int A, int B) {
        Random r = new Random();
        for(int i=1; i<=N; i++) {
            System.out.print( (r.nextInt(B-A+1)+A) + " ");
        }
        System.out.println("");    
    }
    
    // postcondition- return the number of alphabet U and M in the parameter
    public static int getAlphabetUM(String a) {
        int cnt=0;
        for(int i=0; i<a.length(); i++) {
            if (a.charAt(i)=='U' || a.charAt(i)=='M') {
                cnt++;
            }
        }
        return cnt;
    }
    
    // return the perimeter of rectangle (width and height are parameters)
    public static double getPerimeter(double width, double height) {
        return (width+height)*2;
    }
    
    // return the perimeter of circle (radius is parameters)
    public static double getPerimeter(double radius) {
        return 2*Math.PI*radius;
    }
    
  
    // verify no changes on value
    public static void special(int num) {
        num=99;
    }
    
    public static void special(int[] num) {
        num[1]=77;
    }
    
    // return the number of odd number from N random numbers from A - B
    public static int getOdd(int[] num, int A, int B) {
        Random r = new Random();
        int cntOdd=0;
        for(int i=0; i<num.length; i++) {
            num[i] = (r.nextInt(B-A+1)+A);
            if (num[i]%2==1) {
                cntOdd++;
            }
        }
        return cntOdd;
    }
    
    // return the number of odd and even number from N random numbers from A - B 
        public static int[] getOddEven(int[] num, int A, int B) {
        Random r = new Random();
        int[] cnt=new int[2];
        for(int i=0; i<num.length; i++) {
            num[i] = (r.nextInt(B-A+1)+A);
            if (num[i]%2==1) {
                cnt[0]++;
            }
            else {
                cnt[1]++;
            }
        }
        return cnt;
    }
        
}
