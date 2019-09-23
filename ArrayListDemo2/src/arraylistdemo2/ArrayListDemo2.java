
package arraylistdemo2;
import java.util.ArrayList;//has to be at the start of the program for it to work
public class ArrayListDemo2 {

    public static void main(String[] args) {
    ArrayList<String> items = new ArrayList<>();
    items.add("Shirt");
    items.add("Belt");
    items.add("Tie");
    // end of first line
    
    System.out.println(items);
    
    items.add(2,"Shoes");
    //end of second line with new item added
    //"2" means it will be 3rd item on the list
    System.out.println(items);
    
    if(items.contains("Shirt"))
    {
        items.remove("Shirt");
        System.out.println(items);
    }//end of if
    
    
    
    }//end of main
    
}//end of class
