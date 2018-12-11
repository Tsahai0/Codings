/*Name: Tsahai Corbie
  Date: 11/13/18
*/

import java.text.DecimalFormat;

public class CashRegisterTest {

   public static void main(String[] args) {
   
      RetailItem items[] = new RetailItem[10];
   
      items[0] = new RetailItem("gallon of Milk", 3.29, 1);
   
      items[1] = new RetailItem("dozens of eggs", 3.58, 2);
   
      items[2] = new RetailItem("box of cereal", 10.47, 3);
   
      items[3] = new RetailItem("Del Turkey", 13.98, 4);
   
      items[4] = new RetailItem("Rolls", 7.92, 5);
   
      items[5] = new RetailItem("half gallon Ice Cream", 8.98, 2);
   
      items[6] = new RetailItem("box of cookies", 10.47, 5);
   
      items[7] = new RetailItem("zip storage bags", 14.45, 6);
   
      items[8] = new RetailItem("apples", 2.97, 1);
   
      items[9] = new RetailItem("toilet paper rolls", 8.90, 2);
   
      System.out.println("\t\tSales Receipt");
   
      DecimalFormat df = new DecimalFormat("0.00");
   
      System.out.println("------------------------------------------");
   
      CashRegister c = null;
   
      for(int i=0;i<items.length;i++) {
      
         c = new CashRegister(items[i]);
      
         System.out.println((i+1)+"\t"+items[i].getDescription()+"\t"+items[i].getPrice());
      
      }
   
      System.out.println("==========================================");
   
      System.out.println("\t\tTax = "+df.format(c.getTax()));
   
      System.out.println("\t\tTotal Due = "+df.format(c.getTotal()));
   
   }

}