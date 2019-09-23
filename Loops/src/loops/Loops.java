
package loops;

public class Loops {

    public static void main(String[] args) {
        //Delcare and inititalize String
        String[] htm = {"HTML5" , "in ", "easy" , "steps" };
        
        //Use the while loop to output the values stored in each element
        int i = 0 ;
        while (i < htm.length)//int always less than htm amount
        {
            
            System.out.println( "htm[" +i+ "] is | " + htm[i]);
            i++ ;//increment the counter
        }//end of while loop    
        
        //the do-while loop is preceded by an if statement
        // to ensure the array is not empty
        //before attempting to output
        //the value of the first element
        
        
        String[] xml = {};
        
        int j = 0 ;
        if ( xml.length > 0){ do // do is preceded by a conditional test 
                                //to find any value
        {
            
            System.out.println("\t\txml["+ j + "] is | " +xml[j] );
            j++;
        } while ( j < xml.length );
        } //end if
        
        else {
            
            System.out.println("\tArray is empty!");
            
        }//end else
  
    
    }//end of main
    
}//end of class
