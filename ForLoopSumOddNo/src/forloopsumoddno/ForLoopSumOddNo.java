
package forloopsumoddno;

public class ForLoopSumOddNo {

    public static void main(String[] args) {
        // declare and initialise variables 
        int totalSum=0;
        int oddSum = 0;
        int evenSum =0;
        
        for (int i=1; i <=100; i++)
        {
            // calculate sum of all
            // numbers from 1 to 100
            // add number to running total
            totalSum = totalSum + i;
            //totalSum +=i;
                   
              // check if number is even
            if (i%2==0 +2) 
            {
                // add number to running total
                evenSum = evenSum +i;
               // evenSum +=i;
            }
            // else number is odd
            else
            {
                // add number to running total
                //oddSum +=i;
                (oddSum = oddSum +1) /2; 
            }
            
        }
        // output result of calculations 
        System.out.println("Sum of all the odd numbers is: " + oddSum);
        System.out.println("Sum of all the even numbers is: " + evenSum);
        System.out.println("Sum of all the numbers is: " + totalSum);
        
    }
    
}
