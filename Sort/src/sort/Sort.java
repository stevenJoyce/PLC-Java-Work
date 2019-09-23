
package sort;
import java.util.Arrays;
public class Sort {

    public static void main(String[] args) {
    //Declare and Initialize a String array and an int array
        String[] names = {"Mike" , "Dave" , "Andy" };
        int[] nums = {200 , 300 , 100 };
        
    //Output all elements in each array
        display( names );
        display( nums );
        
    //Sort the contents of both arrays
        Arrays.sort( names );
        Arrays.sort( nums );
        
    //Output the contents of the elements again
        display( names );
        display( nums );
    
    
    }//end of main
         // insert a method to display all
        //elements of a passed String array
        public static void display(String[] elems )
        {
            System.out.println("\nStringArray: ");
            for ( int i = 0; i < elems.length; i++)
            System.out.println("Element "+ i + " is " + elems[i]);
        }//end of static void display
        
        // insert a int array method
        public static void display(int[] elems )
        {
            System.out.println("\nInteger Array: ");
            for (int i = 0; i < elems.length; i++)
            System.out.println("Element " + i + " is " + elems[i]);
        }//end of static void int 
        
       
        
}
        
        

