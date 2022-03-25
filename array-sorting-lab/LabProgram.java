import java.util.Scanner;

public class LabProgram {
    // My code
   public static void sortArray(int[] myArr, int arrSize){
      int[] outputArray;
      int i, j, temp;
      outputArray = new int[arrSize];
      
      //Bubble Sort Algorithm
      for (i = 0; i < arrSize; i++)  
        {  
            for (j = i + 1; j < arrSize; j++)  
            {  
                if (myArr[j] > myArr[i])  
                {  
                    temp = myArr[i];  
                    myArr[i] = myArr[j];  
                    myArr[j] = temp;  
                }  
            }  
      }
      for(i = 0; i < arrSize; i++){
         System.out.print(myArr[i] + ",");
      }
      System.out.println();
   }
    //End of my code
    
   public static void main(String[] args) {
       //My Code
      Scanner scnr = new Scanner(System.in);
      int arraySize;
      String input, array[];
      int[] intArray;
      
      input = scnr.nextLine();
      array = input.split(" ");
      arraySize = array.length - 1;
      
      intArray = new int[arraySize];
      
      for(int i = 0; i < arraySize; i++){
         intArray[i] = Integer.valueOf(array[i + 1]);
      }
      
      sortArray(intArray, arraySize);
      // End of my code
   }
}
