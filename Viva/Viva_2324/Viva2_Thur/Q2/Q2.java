package Viva2_Thur.Q2;

public class Q2 {
    public static double[] mergeArray(double[] A, double[] B) {
        double[] c = new double[A.length + B.length];
        int pos = 0;
      
        for (double element : A) {
            c[pos] = element;
            pos++;
        }
      
        for (double element : B) {
            c[pos] = element;
            pos++;
        }
        return c;
    }
  
    public static void bubbleSort(double[] A) {
        double hold;
        for (int pass = 1; pass < A.length; pass++) {
            for (int i = 0; i < A.length - pass; i++) {
                if(A[i] < A[i + 1]) {
                    hold = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = hold;
                }
            }
        }
    }
  
    public static double findMedian(double[] A, double[] B) {
        double[] c = mergeArray(A, B);
        bubbleSort(c);
        int size = c.length;
      
        if (size % 2 == 1) {
            return c[size / 2];
        } else {
            double median = (c[size / 2 - 1] + c[size / 2]) / 2;
            return median;
        }
    }
  
    public static void main(String[] args) {
        double[] Array1 = {2.5,1.2,3.3,4.7};
        double[] Array2 = {10.3,4.2,6.6,2.1};
        System.out.printf("%.3f",findMedian(Array1, Array2));
    }
  
}
