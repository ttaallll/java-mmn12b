

public class PieceWorker extends Employee
{
   private double priceForItem;
   private double itemsProduced;

   // constructor
   public PieceWorker(String firstName, String lastName,
                      String socialSecurityNumber, BirthDate birthDate, double priceForItem, double itemsProduced)
   {
      super(firstName, lastName, socialSecurityNumber, birthDate);

      if (priceForItem < 0.0) // validate priceForItem
         throw new IllegalArgumentException(
            "Price for item must be >= 0.0");

      if (itemsProduced < 0.0) // validate itemsProduced
         throw new IllegalArgumentException(
            "Items produced worked must be >= 0.0");

      this.priceForItem = priceForItem;
      this.itemsProduced = itemsProduced;
   } 

   // set priceForItem
   public void setPriceForItem(double priceForItem)
   {
      if (priceForItem < 0.0) // validate priceForItem
         throw new IllegalArgumentException(
            "Price for item wage must be >= 0.0");

      this.priceForItem = priceForItem;
   }

   // return priceForItem
   public double getPriceForItem()
   {
      return priceForItem;
   } 

   // set itemsProduced
   public void setItemsProduced(double itemsProduced)
   {
      if ((itemsProduced < 0.0)) // validate itemsProduced
         throw new IllegalArgumentException(
            "Items produced worked must be >= 0.0");

      this.itemsProduced = itemsProduced;
   } 

   // return itemsProduced
   public double getItemsProduced()
   {
      return itemsProduced;
   } 

   // calculate earnings; override abstract method earnings in Employee
   @Override                                                           
   public double earnings()                                            
   {
         return this.itemsProduced * this.priceForItem + super.birthdayBonus();
   }                                          

   // return String representation of HourlyEmployee object              
   @Override                                                             
   public String toString()                                              
   {                                                                     
      return String.format("piece worker: %s%n%s: %,.2f; %s: $%,.2f",
         super.toString(), "items produced", getItemsProduced(),
         "price for item", getPriceForItem());
   }                                    
} // end class PieceWorker