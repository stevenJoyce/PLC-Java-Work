
package convert.kmtomiles;
import java.util.Scanner;

public class ConvertKilometresToMiles {

    public static void main(String[] args) {
     //Create scanner object to input
        Scanner a= new Scanner(System.in);
        
        //Declare and intialise variables
        float km= 0f;
        float miles= 0f;
        String output="";        
        
        //Resquest Input
        System.out.println("km to miles convertor:");
        System.out.println("------------------|n");
        System.out.print("Please enter the distance in kms:");
        km= a.nextFloat();
        
        //convert km to miles
       miles= km*0.62137f;
        
        //Output result
        output = "\n"+" km is ";
        System.out.printf(output + "%.2f miles\n",miles);
     
      }//end of main
    
}//end of class



