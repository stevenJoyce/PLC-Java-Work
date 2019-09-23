
package readstring;
import java.io.*;
public class ReadString {

    public static void main(String[] args) {
        // Statement to output a message
        System.out.print("Enter the title of this book: ");
        
        //add a statement to create an InputStreamReader object
        //enabling input to be read from command line
        InputStreamReader isr = new InputStreamReader( System.in );
        
        //Create a BufferedReader object to read the decoded input
        BufferedReader buffer = new BufferedReader( isr);
        
        //Declare and initialize an empty String variable to store input
        String input="";
        
        //Add a try-catcfh statement to read the input 
        //and store it in the String variable
        try
        {
            input = buffer.readLine();
            buffer.close();
        }//end of try
        catch (IOException e)
                {
                    System.out.println("\nThanks, you are reading " + input);
                }//end of catch
    }//end of main
    
}//end of class
