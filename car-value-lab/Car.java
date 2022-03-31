public class Car {
   private int modelYear; 
   // TODO: Declare purchasePrice field (int)
   // My Code
   private int purchasePrice;
   // End my code
   private int currentValue;
   
   public void setModelYear(int userYear){
      modelYear = userYear;
   }
   
   public int getModelYear() {
      return modelYear;
   }
   // My Code
   // TODO: Define setPurchasePrice() method
   public void setPurchasePrice(int price){
      purchasePrice = price;
   }
   
   // TODO: Define getPurchasePrice() method
   public int getPurchasePrice(){
      return purchasePrice;
   }
   // End My Code
   public void calcCurrentValue(int currentYear) {
      double depreciationRate = 0.15;
      int carAge = currentYear - modelYear;
      
      // Car depreciation formula
      currentValue = (int) 
         Math.round(purchasePrice * Math.pow((1 - depreciationRate), carAge));
   }
   // My Code
   // TODO: Define printInfo() method to output modelYear, purchasePrice, and currentValue
   public void printInfo(){
      System.out.printf("Car's information:\n   Model year: %d\n   Purchase price: %d\n   Current value: %d\n", modelYear, purchasePrice, currentValue);
   }
   // End my code
}