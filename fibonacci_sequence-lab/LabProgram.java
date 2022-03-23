import java.util.Scanner;

public class LabProgram {
   
   public static int fibonacci(int n) {
      //My Code
      int fib, fibarray[];
      if(n < 0){
         return -1;
      }
      else if(n == 0){
         return 0;
      }
      else{
         fibarray = new int[n];
         fibarray[0] = 0;
         fibarray[1] = 1;
         
         for(int i = 2; i < n; i++){
            fibarray[i] = fibarray[i-1] + fibarray[i-2];
         }
         fib = fibarray[n-1] + fibarray[n-2];
         return fib;
      }
      // End of My Code
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}