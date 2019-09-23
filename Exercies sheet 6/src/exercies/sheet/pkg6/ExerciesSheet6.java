
package exercies.sheet.pkg6;
import java.util.Scanner;
public class ExerciesSheet6 {

    public static void main(String[] args) {
        
        float RichterScaleValue=0.0f;
        
        //Create a scanner object
        Scanner in= new Scanner (System.in);
        
        //Header
        System.out.print("Richter Scale Damage Checker");
        System.out.print("-------------------------\n");
        
        //Request user input
        System.out.print("Please enter the Richter Scale Value");
        RichterScaleValue= in.nextFloat();
    
        
        if (RichterScaleValue < 4.0) { // damage is little
        System.out.println("Little damage");
    }
        else if(( RichterScaleValue>=4.0)&&(RichterScaleValue<=4.9)){
         System.out.println("Windows shake");
         }
        
        else if ((RichterScaleValue>=5.0)&&(RichterScaleValue<=5.9)) {
        System.out.println("badly built buildings will crumble, "
                + "walls will crack");
        }
        else if ((RichterScaleValue>=6.0)&&(RichterScaleValue<=6.9)) {
        System.out.println("chimneys crash, ordinary buildings damaged");
        }
        
        else if ((RichterScaleValue>=7.0)&&(RichterScaleValue<7.9)) {
        System.out.println("Underground pipes burst, "
                + "well-built buildings are damaged");
        }
        
        else{
        System.out.println("Ground rises and falls in waves, "
                + "most buildings will be destroyed ");
        }
    }// end of main

   
    }// end of class
