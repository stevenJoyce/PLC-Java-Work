
package arraylistdemo3.iterators;
import java.util.*;
public class ArrayListDemo3Iterators {

    public static void main(String[] args) {
    ArrayList<String> names = new ArrayList <String>();
    names.add("Cynthia");
    names.add("Raymond");
    names.add("Jonathan");
    
    Iterator it = names.iterator();
    while (it.hasNext())
    {
        System.out.println(it.next());
    }//end of while-loop
    
        
    }//end of main
    
}//end of class
