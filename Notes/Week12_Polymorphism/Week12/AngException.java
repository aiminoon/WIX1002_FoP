package week12;
// define exception class -  extends Exception 
public class AngException extends Exception {
   public AngException() {
      super("Any Error Message");
   }
   public AngException(String s) {
      super(s);
   }

    
}
