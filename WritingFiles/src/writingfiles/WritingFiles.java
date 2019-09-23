
package writingfiles;
import java.io.*;
public class WritingFiles {

    
    public static void main(String[] args) {
    try 
    {
     //Create a FileWriter object for a text file
     FileWriter file = new FileWriter( "tam.txt");
     
     //Create a BufferedWriter object to write the file
     BufferedWriter buffer = new BufferedWriter (file);
    //Add statements to write into the file
    buffer.write("The wind blew as if it had blown its last");
    buffer.newLine();
    buffer.write("The rattling showers rose on is blast");
    buffer.newLine();
    buffer.write("The speedy gleams the darkness swallowed");
    buffer.newLine();
    buffer.write("Loud, deep and long the thunder bellowed");
    buffer.newLine();
    buffer.write("That night a child might understand");
    buffer.newLine();
    buffer.write("The devil has business on his hand.");
    
    //Close trhe BufferedWriter
    buffer.close();
    
    
     
     
     
    }
    catch (IOException e)
    {
        System.out.println("A write error has occured");
    }
    }//end of main
    
}//end of class
