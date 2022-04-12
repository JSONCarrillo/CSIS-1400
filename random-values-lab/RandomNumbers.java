import java.util.Random;

public class RandomNumbers {
   private int var1, var2, var3;
	Random rand = new Random();
	
   /* Type your code here. */
   
   
   public void setRandomValues(int low, int high){
         var1 = rand.nextInt((high - low) + 1) + low;
         var2 = rand.nextInt((high - low) + 1) + low;
         var3 = rand.nextInt((high - low) + 1) + low;

   }
   
   public int getVar1(){
      return var1;
   }
   public int getVar2(){
      return var2;
   }
   public int getVar3(){
      return var3;
   }
   
   public int[] getRandomValues(){
      int arr[] = new int[3];
      arr[0] = var1;
      arr[1] = var2;
      arr[2] = var3;
      
      System.out.printf("Random values: %d %d %d\n", var1, var2, var3);
      return arr;
   }
}