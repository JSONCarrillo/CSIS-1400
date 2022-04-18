public class ItemToPurchase{
    // Set private int and String for name, price, and quantity
    private String itemName;
    private int itemPrice, itemQuantity;

    // Setter for item name
    public void setName(String name){
        this.itemName = name;
    }

    // Getter for item name
    public String getName(){
        return itemName;
    }

    // Setter for item price
    public void setPrice(int price){
        this.itemPrice = price;
    }

    // Quantity for item price
    public int getPrice(){
        return itemPrice;
    }

    // Setter for item quantity
    public void setQuantity(int quantity){
        this.itemQuantity = quantity;
    }

    // Getter for item quantity
    public int getQuantity(){
        return itemQuantity;
    }
}