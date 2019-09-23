
package exercise.sheet.pkg5;
import java.util.Scanner;

public class ExerciseSheet5 {

    public static void main(String[] args) {
        // Declare and initialise variables
        float height= 0.0f;
       float weight= 0.0f;
        
        // Create a scanner object
        Scanner in= new Scanner(System.in);
       
        //Header
        System.out.println("Weight Checker Tool");
        System.out.println("-----------------\n");
        
        // Request User input
        System.out.print("Please enter the height:");
        height = in.nextFloat();
        System.out.print("Please enter the weight:");
        weight = in.nextFloat();
       
        if ((height/ 2.3) < weight){ //You are overwieght
       System.out.println("You are overweight ");
        }
       else if ((height/2.5)> weight){ //the person is underweight
       System.out.println("You are underweight");
       }
       else { // your weight is normal
       System.out.println("Your weight is normal");
       }
      
        
        }
    
}
