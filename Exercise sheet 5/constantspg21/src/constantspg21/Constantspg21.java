/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constantspg21;

/**
 *
 * @author it120
 */
public class Constantspg21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constant score Values
        final int TOUCHDOWN = 6 ;
        final int CONVERSION = 1;
        final int FIELDGOAL = 3;
       
        
        // change the value of a constant
      //  TOUCHDOWN = 100;  can't change a constant value  
        
        
       // calculate point scored 
        int td, pat, fg, total;
        td = 4 * TOUCHDOWN; // 4 *  6 = 24
        pat = 3 * CONVERSION; // 3 * 1 = 3
        fg = 2 * FIELDGOAL; // 2 * 3 = 6
        total = (td + pat + fg); // 24 +3+6= 33 
        
        //Output calculated total
     System.out.println("Score: "+ total); 
  
    }
    
    
}
