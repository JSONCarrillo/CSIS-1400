import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double[] weights = new double[5];
      double totalWeight, avgWeight, maxWeight;
      totalWeight = avgWeight = maxWeight = 0;
      
      for(int i = 0; i < weights.length;i++){
         System.out.println("Enter weight " + (i + 1) + ":");
         weights[i] = scnr.nextDouble();
         totalWeight += weights[i];
         if(weights[i] > maxWeight){
            maxWeight = weights[i];
         }
      }
      avgWeight = totalWeight / 5;
      
      System.out.print("You entered: ");
      for(int i = 0; i < weights.length;i++){
         System.out.print(weights[i] + " ");
      }
      System.out.println("\n");
      
      
      System.out.println("Total weight: " + totalWeight);
      System.out.println("Average weight: " + avgWeight);
      System.out.println("Max weight: " + maxWeight);
   }
}
