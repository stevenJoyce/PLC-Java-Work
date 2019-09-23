
package doing.pkgdo.pkgwhile.loops.pg55;

public class DoingDoWhileLoopsPg55 {

    
    public static void main(String[] args) {
        //Create a counter for the do whille loop
        int num=100;
        
        //add a do-while loop to display variable's
        //current value while below 0
        do
        {
            System.out.println("DoWhile Countup:" + num);
            num+=10;
        }
        while ( num < 0);
        
    }
}//end of class
