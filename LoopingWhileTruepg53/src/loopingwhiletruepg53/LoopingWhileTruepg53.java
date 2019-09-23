
package loopingwhiletruepg53;

public class LoopingWhileTruepg53 {

    public static void main(String[] args) {
        //Declare and Initialize an interger variable
        int num= 100;
        
        //add while loop to dispay variable's current value
        //to count backwards form 100 to 10
        //in steps of 10
        while( num >0) // keep looping while true
        
        //statements to be repeated
        // each iteration of the loop
        {
            System.out.println("While Countdown: " + num );
            num -=10; // nm = num-10;
        }//end of while
        
        
    }//end of main
    
}//end of class
