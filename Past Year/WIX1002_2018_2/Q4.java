package WIX1002_2018_2;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the values for a, b, c, d, e and f: ");
            int[] values = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

            LinearEquation eq = new LinearEquation(values[0], values[1], values[2], values[3], values[4], values[5]);
            System.out.println("The equation : ");
            System.out.println(eq + "\n");
            System.out.printf("x = %.0f ; y = %.0f", eq.computeX(), eq.computeY());
        }
    }
}

class LinearEquation {
    private int a, b, c, d, e, f;
    private int det;

    public LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        init();
    }

    private void init() {
        this.det = a * d - b * c;
    }

    @Override
    public String toString() {
        return String.format("%dx + %dy = %d\n%dx + %dy = %d", a, b, e, c, d, f);
    }

    public boolean isSolvable() {
        return det != 0;
    }

    public double computeX() {
        return (double) (e * d - b * f) / det;
    }

    public double computeY() {
        return (double) (a * f - e * c) / det;
    }
}
