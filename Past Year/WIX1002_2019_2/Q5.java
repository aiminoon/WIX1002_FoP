package WIX1002_2019_2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values for a, b and c: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        
        QuadraticEquation eq = new QuadraticEquation(a, b, c);
        System.out.println("The equation is : " + eq);

        double dis, r1, r2;
        System.out.printf("Discriminant: %.0f\n", (dis = eq.discriminant()));
        
        if (dis < 0) {
            System.out.println("The equation has no roots");
        } else {
            r1 = eq.calcRoot1();
            r2 = eq.calcRoot2();
            if (r1 == r2) {
                System.out.printf("Same roots : %.0f\n", r1);
            } else {
                System.out.printf("The roots: %.0f and %.0f\n", r1, r2);
            }
        }
        
        sc.close();
    }
}

class QuadraticEquation {
    private final int a, b, c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double discriminant() {
        return b * b - 4.0 * a * c;
    }

    public double calcRoot1() {
        return calcRoot(1);
    }

    public double calcRoot2() {
        return calcRoot(-1);
    }

    private double calcRoot(int flag) {
        double dis = discriminant();
        if (dis < 0) 
          return 0;
        return (-b + flag * Math.sqrt(dis)) / (2.0 * a);
    }

    @Override
    public String toString() {
        return String.format("%dx(^2) + (%d)x + (%d)", a, b, c);
    }
}
