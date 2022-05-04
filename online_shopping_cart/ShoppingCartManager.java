import java.util.Scanner;

public class ShoppingCartManager {

    public static void printMenu() {
        System.out.print(
                "\nMENU\na - Add item to cart\nd - Remove item from cart\nc - Change item quantity\ni - Output items' descriptions\no - Output shopping cart\nq - Quit\n");
    }

    // executes the menu
    public static void executeMenu(char choice, Scanner scnr, ShoppingCart cart) {
        String itemName, description;
        int quantity, price;
        switch (choice) {

            // add item
            case 'a':
                // asks user for name description quantity and price
                System.out.println("Enter item name:");
                itemName = scnr.next();

                System.out.println("Enter item description:");
                description = scnr.next();

                System.out.println("Enter item quantity:");
                quantity = scnr.nextInt();

                System.out.println("Enter item price:");
                price = scnr.nextInt();

                cart.addItem(new ItemToPurchase(itemName, price, quantity, description));
                break;

            // list all items present in the shopping cart
            case 'o':
                System.out.println("OUTPUT SHOPPING CART");
                System.out.printf("%s's Shopping Cart - %s\n", cart.getCustomer(), cart.getDate());
                cart.printTotal();
                break;

            // print descriptions of all items in the cart
            case 'i':
                cart.printDescriptions();
                break;

            // default option for invalid inputs
            default:
                System.out.println("Invalid Choice, try again...");
                break;
        }

    }

    public static void main(String[] arg) {
        // initialize variables and scanner
        Scanner scnr = new Scanner(System.in);
        String name, date;
        char choice;
        boolean quit = false;

        // ask user for name and date
        System.out.println("Enter Customer's Name:");
        name = scnr.next();

        System.out.println("Enter Today's Date:");
        date = scnr.next();

        // initialize the shopping cart
        ShoppingCart cart = new ShoppingCart(name, date);

        // print the customer name and date
        System.out.printf("Customer Name: %s\n Today's Date: %s\n", name, date);

        cart.addItem(new ItemToPurchase("Fuck you", 6, 7, "AAAAA"));

        while (true) {
            // prints the menu
            printMenu();

            // user choice from the menu
            System.out.print("Choose an option: ");
            // scnr.nextLine();
            choice = scnr.next().charAt(0);

            // if user chooses q the app quits
            if (choice == 'q') {
                return;
            }
            // else executes the menu
            executeMenu(choice, scnr, cart);
        }

    }

}