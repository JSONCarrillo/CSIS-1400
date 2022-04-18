//	CSIS:1400
//	Jason Carrillo
//	Online Shopping Cart

import java.util.Scanner;


public class ShoppingCartPrinter {
    public static void main(String[] args) {
        // Inialize Scanner class to scnr object and variables
        Scanner scnr = new Scanner(System.in);
        String itemName;
        int itemPrice, itemQuantity, totalPrice;
        // Initialize ItemToPurchase classes
        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();

        //Input sets the name of item 1
        System.out.println("Item 1");
        System.out.println("Enter the item name:");
        itemName = scnr.nextLine();
        item1.setName(itemName);
        
        //Input sets the price of item 1
        System.out.println("Enter the item price:");
        itemPrice = scnr.nextInt();
        item1.setPrice(itemPrice);

        //Input sets the quantity of item 1
        System.out.println("Enter the item quantity:");
        itemQuantity = scnr.nextInt();
        item1.setQuantity(itemQuantity);
        
        // Scanner is dumb, so I need this nextLine in order for it to not skip over the next input
        scnr.nextLine();
        
        //Input sets the name of item 2
        System.out.println("Item 2");
        System.out.println("Enter the item name:");
        itemName = scnr.nextLine();
        item2.setName(itemName);

        //Input sets the price of item 2
        System.out.println("Enter the item price:");
        itemPrice = scnr.nextInt();
        item2.setPrice(itemPrice);

        //Input sets the quantity of item 2
        System.out.println("Enter the item quantity:");
        itemQuantity = scnr.nextInt();
        item2.setQuantity(itemQuantity);


        // Calculates the total price of both items given their price and quantity
        totalPrice = (item1.getPrice() * item1.getQuantity()) + (item2.getPrice() * item2.getQuantity());

        // Prints out the toal cost
        System.out.println("TOTAL COST: ");
        System.out.printf("%s %d @ $%d = $%d\n", item1.getName(), item1.getPrice(), item1.getQuantity(), (item1.getPrice() * item1.getQuantity()));
        System.out.printf("%s %d @ $%d = $%d\n", item2.getName(), item2.getPrice(), item2.getQuantity(), (item2.getPrice() * item2.getQuantity()));
        System.out.printf("Total: $%d\n", totalPrice);
        // closes scnr object
        scnr.close();
    }
}