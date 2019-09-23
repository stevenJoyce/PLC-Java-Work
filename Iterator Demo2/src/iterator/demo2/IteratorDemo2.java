
package iterator.demo2;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {

    public static void main(String[] args) {
    // Create an array list
    ArrayList<String> al = new ArrayList <String>();
    
    //Add elements to the array list
    al.add("Cork");
    al.add("Limerick");
    al.add("Dublin");
    al.add("Galway");
    al.add("Clare");
    al.add("Waterford");
    
    //Use an iterator to display contents of array list 
    Iterator itr = al.iterator();
    while(itr.hasNext())
    {
        Object element = itr.next();
        System.out.println(element + " ");
    }//end of while-loop
        
        }//end of main
    
}//end of class
