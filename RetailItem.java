//Name: Tsahai Corbie
//Date: 12/10/18

public class RetailItem {

private String description;

private int unitsOnPurchase;

private double price;

public RetailItem(String description, double price, int unitsOnPurchase ){

this.description = description;

this.unitsOnPurchase = unitsOnPurchase;

this.price = price;

}

public String getDescription() {

return description;

}

public void setDescription(String description) {

this.description = description;

}

public int getUnitsOnHand() {

return unitsOnPurchase;

}

public void setUnitsOnHand(int unitsOnHand) {

this.unitsOnPurchase = unitsOnHand;

}

public double getPrice() {

return price;

}

public void setPrice(double price) {

this.price = price;

}

}

