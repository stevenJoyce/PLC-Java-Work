
package convert.kilometres.to.miles;
import java.util.Scanner;

public class ConvertKilometresToMiles {
    public static void main(String[] args) {
       
        //Create scanner object to input
        Scanner in= new Scanner(System.in);
        
        //Declare and intialise variables
        float km= 0.0f;
        float miles=0.0f;
        String output="";        
        
        //Resquest Input
        System.out.println("Km to Miles Convertor:");
        System.out.println("------------------|n");
        System.out.print("Please enter the distance in KMs:");
        km= in.nextFloat();
        
        //convert km to miles
       miles= km*0.62137f;
        
        //Output result
        output = "\n "+" km is";
        System.out.printf(output + "%.2f Miles\n",miles);
        
    
    
    }
    
}
