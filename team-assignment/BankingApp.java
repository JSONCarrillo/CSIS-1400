// Name: Jason Carrillo
// Class: CSIS-1400
// Assignment: BankingApp (Team Project)

import java.util.Scanner;
import java.util.ArrayList;

public class BankingApp {
    public static void main(String arg[]){
        Scanner scnr = new Scanner(System.in);
        double balance;
        boolean hasChecking, hasSavings, quit;
        char choice;
        int totalAccounts = 0, i;
        hasChecking = hasSavings = quit = false;

        //Accounts array list
        ArrayList<Account> accounts = new ArrayList<Account>();

        //Welcome Screen
        System.out.println("********************");
        System.out.println("**                **");
        System.out.println("**   Welcome to   **");
        System.out.println("**   CSIS Bank!   **");
        System.out.println("**                **");
        System.out.println("********************\n\n");

        
        while(true){
            menu();
            choice = Character.toLowerCase(scnr.next().charAt(0));

            switch(choice){
                // quit application
                case 'h':
                    return;

                // open an account
                case 'a':
                
                    while(!quit){
                        System.out.println("What type of account would you like to open?\nChecking (a)\nSavings (b)\nCancel(q)");
                        char accountChoice = Character.toLowerCase(scnr.next().charAt(0));

                        switch(accountChoice){
                            case 'a':
                                if(hasChecking == true){
                                    System.out.println("You already have a savings account");
                                    quit = true;
                                    break;
                                }

                                Account checking = new Account();
                                checking.setAccountName("Checking");
                                checking.setAccountType(false);
                                checking.setAPR(0.00);

                                System.out.println("How much for your initial deposit?");
                                checking.setBalance(scnr.nextDouble());

                                checking.display();
                                hasChecking = true;
                                quit = true;
                                break;

                            case 'b':
                            case 'q':
                                quit = true;
                                
                            default:
                                System.out.println("Try Again");
                        }
                    }
                    break;

                case 'b':

                // default for invalid options
                default:
                    System.out.println("Invalid Response: ");
            }
        }

    }

    public static void menu(){
        System.out.println("What would you like to do?\n");
        System.out.println("a - Create Account");
        System.out.println("b - View Accounts");
        System.out.println("c - Deposit");
        System.out.println("d - Withdraw");
        System.out.println("e - Transfer");
        System.out.println("f - Apply for Loan");
        System.out.println("g - Frequently Asked Questions");
        System.out.println("h - Quit");
    }
}

