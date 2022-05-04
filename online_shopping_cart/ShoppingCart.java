import java.util.ArrayList;

public class ShoppingCart {
    private String customerName, currentDate;
    private ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>();
    private int i;

    // default constructor
    public ShoppingCart() {
        this.customerName = "none";
        this.currentDate = "January 1, 2016";
    }

    // initialize
    public ShoppingCart(String name, String date) {
        this.customerName = name;
        this.currentDate = date;
    }

    // returns the customer variable
    public String getCustomer() {
        return customerName;
    }

    // return the date
    public String getDate() {
        return currentDate;
    }

    // adds item to the cart
    public void addItem(ItemToPurchase item) {
        this.cartItems.add(item);
    }

    // removes item from the cart
    public void removeItem(String name) {

    }

    // modifies the item in the cart
    public void modifyItem(String item) {

    }

    // gets the total number of items in the cart
    public int getNumItemsInCart() {
        return cartItems.size();
    }

    // returns the total cost of the cart
    public int getCostOfCart() {
        int cost = 0;

        for (i = 0; i < cartItems.size(); i++) {
            cost += cartItems.get(i).getPrice() * cartItems.get(i).getQuantity();
        }

        return cost;
    }

    // prints the total
    public void printTotal() {
        for (i = 0; i < cartItems.size(); i++) {
            System.out.printf("%s $%d @ %d = $%d\n\n", cartItems.get(i).getName(), cartItems.get(i).getQuantity(),
                    cartItems.get(i).getPrice(), (cartItems.get(i).getPrice() * cartItems.get(i).getQuantity()));
        }
        System.out.println("$" + getCostOfCart());
    }

    // prints the cart description with item, quantity, and price
    public void printDescriptions() {
        System.out.println("\n\nItem Descriptions");
        for (i = 0; i < cartItems.size(); i++) {
            System.out.printf("%s: %s", cartItems.get(i).getName(), cartItems.get(i).printDescription());
        }
    }

}