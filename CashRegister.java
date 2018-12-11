/*Name: Tsahai Corbie
  Date: 11/13/18
*/
public class CashRegister {

   private double TAX_RATE = 0.06;

   private static double retailPrice;

   private static int quantity;

   public CashRegister(RetailItem item) {
   
      retailPrice+=item.getPrice();
   
      quantity+=item.getUnitsOnHand();
   
   }

   public double getSubtotal() {
   
      return retailPrice;
   
   }

   public double getTax() {
   
      return retailPrice * TAX_RATE;
   
   }

   public double getTotal() {
   
      return getSubtotal()+getTax();
   
   }

}
