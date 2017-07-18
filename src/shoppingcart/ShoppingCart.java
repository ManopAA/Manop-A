package shoppingcart;

import bangkok.Customer;
import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {
        Item[] items = {new Item("Shirt", 30, 10), 
                       new Item("Polo", 20, 10),
                       new Item("Trousers", 10, 10),
                       new Item("Scarf", 5, 10)};
        
        Customer customer1 = new Customer("Duke", 100);
        
               
        Cart cart = new Cart();
        
        System.out.println("Main menu: [C: Checkout, X: Exit]\n1: Shirt\n2: Polo\n3: Trousers\n4: Scarf");
        System.out.print("Choose you items: ");
        Scanner sc = new Scanner(System.in);
        String vinput = sc.nextLine();
        
        
        cart.addItem(items[0]);
        cart.addItem(items[3]);
        
        customer1.pay(cart);
    }
    
}
