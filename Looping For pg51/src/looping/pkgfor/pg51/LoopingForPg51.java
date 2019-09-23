
package looping.pkgfor.pg51;

public class LoopingForPg51 {

    public static void main(String[] args) {
        //Declare and initialize an interger
        //variable to count the
        //total number of iterations
        
        int num=0;
        
        //a for-loop to perform
        //three iterations
        //and display the current value
        //of its counter variable
        //on each iteration
       
        for (int i=1; i<4; i++)
        {
            System.out.println("Outer Loop i= "+ i );
        
        // insert a nested for-loop
        // to perform a iterations
        // display the current value-j
        // and total number of iterations
        
        for (int j=1; j<4; j++ )
        {
            System.out.print("\tInner Loop j=" +j);
            System.out.println("\t\tTotal num="+(++num) );
        }// end of innter for-loop     
              
        
        }//end of outer for-loop
    
    
    }//end of main
    
}//end of class

//do-while-loop always execute statement at least once,
//while-loop may not execute statement!!!
