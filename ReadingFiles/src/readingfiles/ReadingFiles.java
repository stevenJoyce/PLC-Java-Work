
package readingfiles;
import java.io.*;
public class ReadingFiles {

    public static void main(String[] args) {
     try
     {
         //a statement to create a FileReader object
         FileReader file = new FileReader("E:/oscar.txt");
         
         //Create a BufferedReader object to read the file
         BufferedReader buffer = new BufferedReader( file );
         
         //Declare and initialize an empty String variable
         //to store a line of text
         String line = "";
         
         //while loop to read the textfile contents into
         //the variable and output each line of text
         while ((line = buffer.readLine())!=null)
         {
             System.out.println( line );
         }//end of while loop
         //close BufferReader object when it is no longer needed
         buffer.close();
         
     }//end of try
     catch (IOException e )
     {
         System.out.println("A read error has occurred");
         
     }//end of catch
        
        
    }//end of main
    
}//end of class
