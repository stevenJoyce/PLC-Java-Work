
package round;

public class Round {

    public static void main(String[] args) {
        //Declare and initialize a float variable
        float num = 7.25f;
        
        //Output float as an int value
        System.out.println(num+" rounded is " +Math.round(num));
        
        //Output rounded float value as double value
        System.out.println(num+" floored is "+ Math.floor (num));
        System.out.println(num+" ceiling is "+ Math.ceil (num));
        
    }//end of main 
    
}//end of class
