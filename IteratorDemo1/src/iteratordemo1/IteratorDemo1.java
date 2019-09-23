
package iteratordemo1;
import java.util.ArrayList;
public class IteratorDemo1 {

    public static void main(String[] args) {
    //Create an array list
    ArrayList<String> al = new ArrayList<String>();
    
    //add elements to the array ;ist
    al.add("Cork");
    al.add("Limerick");
    al.add("Dublin");
    al.add("Galway");
    al.add("Clare");
    al.add("Waterford");
    
    //Use an enhanced for-loop to 
    //access the contents on the array list.    
    for(String s:al)
    {
        System.out.println(s);
    }

    }//end of main
    
}//end of class
