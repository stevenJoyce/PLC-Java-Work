
package stringcomparision;

public class StringComparision {

    public static void main(String[] args) {
        // create and initialize a string variable
        //with a correct lowercase password
        String password = "bingo";
        
       //add a try catch statement to catch the exception
        //that occurs with incorrect password
        try{    }
        catch(Exception e )
        {
            System.out.println("Password required.");
        }
        if (args[0].toLowerCase().equals( password ))
        {
            System.out.println("Password accepted.");
        }//end of if
        else
        {
            System.out.println("Incorrect password.");
        }
        
    
    }//end of main
    
}//end of class
