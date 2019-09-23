
package power;

public class Power {

    public static void main(String[] args) {
        // Declare and initialize an int variable
        int num= Integer.parseInt(args[0]);
        
        //perform mathematical calculations 
        //to cast results into int variables
        int square= (int) Math.pow(num,2);
        int cube= (int) Math.pow(num,3);
        int sqrt= (int) Math.sqrt( num );
        
        //Output the results
        System.out.println(num+ "squared is" + square);
        System.out.println(num+ "cubed is"+ cube);
        System.out.println("Square root of"+num+"is"+sqrt);
        
        
        
    
    
    
    
    }//end of main
    
}//end of class
