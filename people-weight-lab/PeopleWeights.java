import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
      // My Code
      //initialize variables
      Scanner scnr = new Scanner(System.in);
      double[] weights = new double[5];
      double totalWeight, avgWeight, maxWeight;
      totalWeight = avgWeight = maxWeight = 0;
      
      //for loop that asks for user input given the pre-determined length of the array
      for(int i = 0; i < weights.length;i++){
         System.out.println("Enter weight " + (i + 1) + ":");
	 //saves the value the user input into the index of the array
         weights[i] = scnr.nextDouble();
	 //adds to total weight
         totalWeight += weights[i];
	 //checks if current weight is larger than the current max weight, if it is greater, it will be assigned the new max weight
         if(weights[i] > maxWeight){
            maxWeight = weights[i];
         }
      }
      //generates average weight
      avgWeight = totalWeight / 5;
      
      //prints all weights entered by user
      System.out.print("You entered: ");
      for(int i = 0; i < weights.length;i++){
         System.out.print(weights[i] + " ");
      }
      System.out.println("\n");
      
      //prints total, average, and max weights respectively
      System.out.println("Total weight: " + totalWeight);
      System.out.println("Average weight: " + avgWeight);
      System.out.println("Max weight: " + maxWeight);
      // End of My Code
   }
}
