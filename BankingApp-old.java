import java.util.Scanner;

public class BankingApp {
   public static void main(String arg[]) {
      Scanner scnr = new Scanner(System.in);
      int i;
      int numAccounts;
      boolean a = true;
      
      System.out.println("Welcome!");
      System.out.println("How many accounts would you like to open up?");
      numAccounts = scnr.nextInt();
      
      AccountDetails account[] = new AccountDetails[numAccounts];
      
      for (i = 0; i < numAccounts; i++) {
         account[i] = new AccountDetails();
         account[i].openAccount();
      }
      
      while (a) {
         outputMenu();
         
         char userInput = scnr.next().charAt(0);
         if (userInput == 'E') {
            loanApplication();
         }
         
         else if (userInput == 'G') {
            a = false;
         }
      }
   }
   
   public static void outputMenu() {
      System.out.println("What would you like to do?");
      System.out.println();
      System.out.println("A - Accounts");
      System.out.println("B - Deposit");
      System.out.println("C - Withdraw");
      System.out.println("D - Transfer");
      System.out.println("E - Apply for Loan");
      System.out.println("F - Frequently Asked Questions");
      System.out.println("G - Quit");
   }
}
      
class AccountDetails {
   Scanner scnr = new Scanner(System.in);
   private String userName, userAddress, userPhone, userPass;
   private int userID;

   public void openAccount() {
      System.out.print("Enter first and last name: ");
      userName = scnr.next();
      System.out.print("Enter current address: ");
      userAddress = scnr.next();
      System.out.print("Enter current phone number: ");
      userPhone = scnr.next();
      System.out.print("Enter blank digit ID: ");
      userID = scnr.nextInt();
      System.out.print("Enter password for new account: ");
      userPass = scnr.next();
   }
}

class LoanDetails {
   Scanner scnr = new Scanner(System.in);
   private double interestRate = 5.60;
   private double loanAmount;
   private String loanType;
   private int creditScore;
   char userLoanOption;
   boolean c = on;
   
   public void loanApplication() {
      System.out.println("What type of loan would you like to apply for?");
      
      while (c) {
         outputMenu();
         
         userLoanOption = scnr.next().charAt(0);
         userLoanOption = Character.toLowerCase(userLoanOption);
         System.out.println();
         
         switch(userLoanOption){
            case "A":
               break;
            default:
               System.out.println("Try again");
               break;
         }
      }
   }
           
   public void loanQuestions() {
      System.out.println("Current interest rate: " + interestRate);
      
      System.out.print("Enter your loan amount: ");
      loanAmount = scnr.nextDouble();
      
      System.out.print("Enter credit score: ");
      creditScore = scnr.nextInt();
   }
}          