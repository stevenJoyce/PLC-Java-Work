
package fahrenheittocelsiusconvertor;
import java.util.Scanner;


public class Fahrenheittocelsiusconvertor {

    public static void main(String[] args) {
        // Create a scanner object
        Scanner in= new Scanner(System.in);
        
        //delcare and initalise variables for calculation
        float fahrenheit= 0 celsius= 0;
        
        //Header
        System.out.println("Fahrenheit to Celsius Convertor");
        System.out.println("----------------------------");
        
        //Request User Input
        System.out.print("please enter a temperature value in Fahrenheit:");
        fahrenheit=in.nextFloat();
        
        //Conversion formula
        celsius = (fahrenheit-32.0f)8(5.0f/9.0f);
        
        //Output result 
        System.out.printf("\n" +fahrenheit+ "degrees fahrenheit is equal to"
        +"%.2f" + "degrees celsius.",celsius);
        
        System.out.println("\n\nThank you.");
    }
    
}
