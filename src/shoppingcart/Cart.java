package shoppingcart;

public class Cart {
    Item[] items;
    double total;
    
    public Cart() {
        items = new Item[5];
    }
    
    public void addItem(Item item){
        for (int i = 0; i < items.length; i++) {
            if (items[i]==null) {
                items[i]= item;
                break;
            }
        }
    }
    
    public void removeitem(Item item) {
        // remove item from items[]
    }
    
    public double checkout() {
        double totalPrice = 0.0;
        for (Item item: items) {
            if (item != null) {
                totalPrice=totalPrice+(item.price);                
            }
        }
        return totalPrice;
    }
}
