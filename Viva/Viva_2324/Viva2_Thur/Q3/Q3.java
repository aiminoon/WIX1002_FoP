package Viva2_Thur.Q3;

class Q3 {
    public static void main(String[] args) {
        String[] input = {"2e", "1a", "11e2.5", "-3", "+3", "+-3"};
        boolean[] output = isNumeric(input);
        System.out.print("Output: {");
      
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
            if (i < output.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }
  
    public static boolean[] isNumeric(String[] arr) {
        boolean[] result = new boolean[arr.length];
      
        for (int i = 0; i < result.length; i++) {
            try {
                Double.parseDouble(arr[i]);
                result[i] = true;
            } catch (NumberFormatException e) {
                result[i] = false;
            }
        }
        return result;
    }
  
}
