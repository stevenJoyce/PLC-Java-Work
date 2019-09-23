
package listfiles;
import java.io.*;
public class ListFiles {

    public static void main(String[] args) {
        // Insert a statement to create a file object
        //for a directory folder named "data"
        //file dir =new File("data");
       
        //this is for USB or External files 
        File dir = new File("E:/coursework");
        
        //Create an IF Statement to output 
        //the names of all files 
        if (dir.exists())
        {
            String[] files = dir.list();
            System.out.println(files.length +"files found...");
            for (int i = 0; i < files.length; i++)
            {
                System.out.println(files[i]);
            }//end of for
        }//end of if
        else
        {   System.out.println("Folder not found.");        }
    }//end of main
    
}//end of class
