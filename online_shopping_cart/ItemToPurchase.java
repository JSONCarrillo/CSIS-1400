public class ItemToPurchase {
    // Set private int and String for name, price, and quantity
    private String itemName, itemDescription;
    private int itemPrice, itemQuantity;

    public ItemToPurchase() {
        this.itemDescription = "None";
    }

    public ItemToPurchase(String name, int price, int qty, String item) {
        this.itemName = name;
        this.itemPrice = price;
        this.itemQuantity = qty;
        this.itemDescription = item;
    }

    // Setter for item name
    public void setName(String name) {
        this.itemName = name;
    }

    // Setter for item description
    public void setDescription(String item) {
        this.itemDescription = item;
    }

    // Getter for item name
    public String getName() {
        return itemName;
    }

    // Setter for item price
    public void setPrice(int price) {
        this.itemPrice = price;
    }

    // Quantity for item price
    public int getPrice() {
        return itemPrice;
    }

    // Setter for item quantity
    public void setQuantity(int quantity) {
        this.itemQuantity = quantity;
    }

    // Getter for item quantity
    public int getQuantity() {
        return itemQuantity;
    }

    public String printDescription() {
        return itemDescription;
    }
}