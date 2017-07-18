/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangkok;

import shoppingcart.Cart;
/**
 *
 * @author DataOne
 */
public class Customer {
    public String name;
    public int money;    
    
    public Customer(String name, int money){
        this.name = name;
        this.money = money;
    }
    
    public void pay(Cart cart) {
        // remove money for pay amount
        double remainMoney = money - cart.checkout();
        System.out.println("Total price checkout is " + cart.checkout());
        System.out.println("I only remaining  " + remainMoney);        
    }
}
