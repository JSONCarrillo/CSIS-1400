//	CSIS:1400
//	Jason Carrillo
//	Soccer Team Roster

import java.util.Scanner;

public class PlayerRoster {
   
   // function that opens the menu
   public static void menu(){
      System.out.print("\n\nMENU\nu - Update player rating\na - Output players above a rating\nr - Replace player\no - Output roster\nq - quit\n\nChoose an option: ");
   }  

   public static void main(String[] args) {
      //declare variables
      Scanner scnr = new Scanner(System.in);
      int playerNumberArray[], playerRatingArray[];
      char userChoice;
      playerNumberArray = new int[5];
      playerRatingArray = new int[5];
      
      //for loop that adds to the array of player numbers and ratings
      for(int i = 0; i < 5;i++){
         while(true){
            System.out.print("Enter player " + (i + 1) + "'s jersey number: ");
            playerNumberArray[i] = scnr.nextInt();
            System.out.print("Enter player " + (i + 1) + "'s rating: ");
            playerRatingArray[i] = scnr.nextInt();
            System.out.println();

            if((playerNumberArray[i] >= 0 && playerNumberArray[i] <= 99) && (playerRatingArray[i] >= 1 && playerRatingArray[i] <= 9)){
               break;
            }
            else{
               System.out.print("Invalid entry or entries. Please Try Again.\n");
            }
         }
      }

      //an object array that adds the inputs from above into a unqiue player object
      Player[] roster;
      roster = new Player[5];
      roster[0] = new Player(playerNumberArray[0], playerRatingArray[0]);
      roster[1] = new Player(playerNumberArray[1], playerRatingArray[1]);
      roster[2] = new Player(playerNumberArray[2], playerRatingArray[2]);
      roster[3] = new Player(playerNumberArray[3], playerRatingArray[3]);
      roster[4] = new Player(playerNumberArray[4], playerRatingArray[4]);


      //calls the menu
      menu();

      //while loop that checks for user commands
      do{
         userChoice = scnr.next().charAt(0);
         //ensures a user can input a non case senstive input
         userChoice = Character.toLowerCase(userChoice);

         //switch case that takes user choice and does an action based on the input
         switch(userChoice){
            //update player rating
            case 'u':
               System.out.print("Enter jersey number: ");
               int chosenPlayer = scnr.nextInt();
               // loops through the roster array
               for(int i = 0; i < roster.length; i++){
                  //checks if the user input matches the current iterations jersey number
                  if(chosenPlayer == roster[i].playerNumber){
                     System.out.print("Enter a new rating for a player: ");
                     //while loop ensures a player cannot enter a rating outside of range 1-9
                     while(true){
                        roster[i].playerRating = scnr.nextInt();
                        if(roster[i].playerRating >= 1 && roster[i].playerRating <= 9){
                           break;
                        }
                        else{
                           System.out.print("Invalid rating. Ratings must be between 1 and 9. Try again: ");
                        }
                     }
                  }
               }
               menu();
               break;

            //output players above a rating
            case 'a':
               System.out.print("Enter minimum rating: ");
               int rosterMin = scnr.nextInt();
               //loops through all entries in the roster array
               for(int i = 0; i < roster.length; i++){
                  //if statement prints the players info if they are above or equal to the specified minimum rating
                  if(roster[i].playerRating >= rosterMin){
                     System.out.print("Player " + i + " -- ");
                     roster[i].display();
                  }
               }
               menu();
               break;

            //replace player
            case 'r':
               System.out.print("Enter jersey number: ");
               chosenPlayer = scnr.nextInt();
               //loops through all entries in the roster
               for(int i = 0; i < roster.length; i++){
                  //if the user input matches the iteration's player number proceeds with the logic
                  if(chosenPlayer == roster[i].playerNumber){
                     //loop checks for invalid entries 
                     while(true){-
                        System.out.print("Enter player " + (i + 1) + "'s jersey number: ");
                        playerNumberArray[i] = scnr.nextInt();
                        System.out.print("Enter player " + (i + 1) + "'s rating: ");
                        playerRatingArray[i] = scnr.nextInt();
                        System.out.println();

                        if((playerNumberArray[i] >= 0 && playerNumberArray[i] <= 99) && (playerRatingArray[i] >= 1 && playerRatingArray[i] <= 9)){
                           break;
                        }
                        else{
                           System.out.print("Invalid entry or entries. Please Try Again.\n");
                        }
                     }
                  }
               }
               menu();
               break;

            //output roster
            case 'o':   
               for(int i = 0; i < roster.length; i++){
                  roster[i].display();
               }
               menu();
               break;
            
            // quit, this prevents a user from getting the invalid choice print when quitting
            case 'q':
               break;

            //default if user inputs an invalid command
            default:
               System.out.print("Invalid choice, try again: ");
               
         }
         //checks if user put an a quit command
      }while(userChoice != 'q');
   }
}

//player class for easy altering of jersey and ratings
public class Player{
   public int playerNumber, playerRating;

   public Player(int num, int rating){
      this.playerNumber = num;
      this.playerRating = rating;
   }

   public void display(){
      System.out.println("Jersey Number: " + playerNumber + " | Rating: " + playerRating);
   }

}