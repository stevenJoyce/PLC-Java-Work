
package breakingoutofloops;

public class BreakingOutOfLoops {

    public static void main(String[] args) {
        // TODO code application logic here
    for(int i=1; i<4; i++)
    {
        //nested for loop
        for(int j=1; j<4; j++)
        { 
           if (i==1 && j==1)
           {
               System.out.println("Continues innerLoop when i=" +i+ " j= " +j);
               continue;
           }//end of innerloop break    
            
            
            //break out of inner loop
            if(i==2 && j==1)
            {
                System.out.println("BreaksInnerLoop when i= " +i+ " j= "+j);
                
                break;
            }//end of break in loop
          
            System.out.println("Running i= " + i + " j= " +j);
        }
    }//end of nested for loop    
    
    
    
    }//end of main
}//end of class
