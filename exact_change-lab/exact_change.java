import java.util.Scanner; 

public class exact_change {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        // My Code
        int dollar = 0, userChange, penny = 0 , nickel = 0, dime = 0, quarter = 0;
       
        System.out.print("Please enter your change (example: for $1.25 enter 125):");
        userChange = scnr.nextInt();
	    System.out.println("");
        // Checks to ensure user actually puts in a value
        if(userChange > 0){

            // Uses order of operations to calculate the amount of dollars
            dollar = (userChange - (userChange % 100)) / 100;
            
            // if dollar returns a 0 then this block will not execute
            if(dollar > 0){
                System.out.print(dollar);
                // sets if there is a plural or singular usage
                if(dollar == 1){
                    System.out.println(" Dollar");
                }
                else{
                    System.out.println(" Dollars");
                }
            }

            //subtracts the dollars from the user change to prevent improper calculations
            userChange -= dollar * 100;

            quarter = (userChange - (userChange % 25)) / 25;

            if(quarter > 0){
                System.out.print(quarter);
                if(quarter == 1){
                    System.out.println(" Quarter");
                }
                else{
                    System.out.println(" Quarters");
                }
                // subtracts quarter calculation from user change
                userChange -= quarter * 25;
            }

        
            dime = (userChange - (userChange % 10)) / 10;
            if(dime > 0){
                System.out.print(dime);
                if(dime == 1){
                    System.out.println(" Dime");
                }
                else{
                    System.out.println(" Dimes");
                }

                userChange -= dime * 10;
            }

            nickel = (userChange - (userChange % 5)) / 5;

            if(nickel > 0){
                System.out.print(nickel);
                if(nickel == 1){
                    System.out.println(" Nickel");
                }
                else{
                    System.out.println(" Nickels");
                }
                userChange -= nickel * 5;
            }

            penny = userChange;

            if(penny > 0){
                System.out.print(penny);
                if(penny == 1){
                    System.out.println(" Penny");
                }
                else{
                    System.out.println(" Pennies");
                }
            }

            
        }
        else{
            System.out.println("No Change");
        }
        // End of my code
    }
}
