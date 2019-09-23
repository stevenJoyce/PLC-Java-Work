
package returningcontrol;

public class ReturningControl {

    public static void main(String[] args) {
        //public loops
    
        OuterLoop: for(int i=1; i<4; i++)
    {
        for(int j=1; j<4; j++)
        {
            if(i==2 && j==3)
            {
                System.out.println("Breaks outerloop when i=" +i+ " j= " +j);
                break OuterLoop;
            }//break in outerloop    
            
            if(i==1 && j==1)
            {
                System.out.println("Continues OuterLoop when i="
                +i+ " j= " +j);
                continue OuterLoop ;
            }//outerloop continues   
            
            System.out.println("Running i=" +i+ " j= " +j);
        }//
        
    }    
    
     }//end of main
    
}//end of class
