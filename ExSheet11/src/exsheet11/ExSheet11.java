
package exsheet11;

public class ExSheet11 {

    public static void main(String[] args) {
        // TODO code application logic here
    int totalSum= 0;
    int oddSum= 0;
    int evenSum= 0;
    
   
    for (int i=1 ; i<101; i++)
       { //calculate sum of all
         // numbers 1 to 100   
          totalSum= totalSum+ i;
          
          //use if variable to see if it is an even number
          if (1%2==0)
          {
              //add number to totalsum
              evenSum = evenSum + i;
             }
          else
          {
              //add number ti totalsum
              oddSum = oddSum + i;
          }
          
          //Output all calculations
          System.out.println("Sum of all odd numbers is " +oddSum);
          System.out.println("Sum of all even numbers is " +evenSum);
          System.out.println("Sum of all total numbers is " +totalSum);
          
       }
   
  
   }//end of main
    
}
