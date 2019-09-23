
package shoppingcart;

public class ShoppingCart {

    public static void main(String[] args) {
        
     String custname ="Mary Smith";
        
     String[] items = {"Shirt", "Boots", "Scarf", "Sweater", "Gloves"};
        
     String message = custname+=" wants to purchase "+ items.length + " items.";
        
     System.out.println(message);
     System.out.println("Mary definately wants a " +items[3]);
     //index always starts at 0, [3]=4th item
   
    
    
    
    }//end of main
    
}//end of class
