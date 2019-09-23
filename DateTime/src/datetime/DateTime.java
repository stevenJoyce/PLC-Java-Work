
package datetime;
import java.time.LocalDateTime;
import java.io.*;
public class DateTime {

    public static void main(String[] args) {
        // Create a current LocalDateTime object
        LocalDateTime date = LocalDateTime.now();
        
        //Output the current date and time
        System.out.println("\nlt is now " + date );
        
        //Increment the year and 
        //Output the revised date and time
        date = date.withYear( 2018 );
        System.out.println("\nDate is now " + date);
  
        
        
        //Output individual LocalTimwDate fields of revised date
        String fields = "\nYear:\t\t\t" + date.getYear();
        
        fields += "\nMonth:\t\t\t" + date.getMonth();
        
        fields += "\nMonth Number :\t\t" + date.getMonthValue();
        
        fields += "\nDay: \t\t\t" + date.getDayOfWeek();
        
        fields += "\nDay Number:\t\t" + date.getDayOfMonth();
        
        fields += "\nDay Number of Year:\t" + date.getDayOfYear();
        
        fields += "\nHour (0-23):\t\t" + date.getHour();
        
        fields += "\nMinute:\t\t\t" + date.getMinute();
        
        fields += "\nSecond:\t\t\t" + date.getSecond();
        
        //Outputs all the variables
        System.out.println( fields );
       
              try
        { //Create a FileWriter object for a text file
     FileWriter time = new FileWriter( "Date&Time.txt");
     
     //Create a BufferedWriter object to write the file
     BufferedWriter buffer = new BufferedWriter (time);
        }//end of try
        catch (IOException e)
                {
                    System.out.println("\nThanks, you are reading " + date);
                }//end of catch
        
     
    }//end of main
    
}//end of class
