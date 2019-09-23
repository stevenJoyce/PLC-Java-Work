
package formats;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;

public class Formats {

    public static void main(String[] args) {
        
        //declare and initialize variables for user output
        int a = 192837465;
        float b = 999.99f;
        float c =00.65f;
        
        //Insert statements to output
        //a number with group separators
        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.println("\nNumber: " + nf.format(a));
        
        //Add statements to output a number
        //with a currency sign
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        System.out.println("\nCurrency: " + cf.format(b));
        
        //Add a statement to output a number with % sign
        NumberFormat pf = NumberFormat.getPercentInstance();
        System.out.println("Percent: "+ pf.format(c));
        
        //Add a statement creating a current LocalDateTime Object
        java.time.LocalDateTime now = java.time.LocalDateTime.now();
        
        //Add a statement to output a formatted numerical date
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM d, yyy");
        System.out.println("\nDate: "+ now.format(df));
        
        //Add a statement to output a formatted numerical time
       DateTimeFormatter tf = DateTimeFormatter.ofPattern("h:m a");
       System.out.println("\nTime: "+ now.format(tf) );
        
       //Insert a variable
       
        
        
        
    }//end of main
    
}//end of class
