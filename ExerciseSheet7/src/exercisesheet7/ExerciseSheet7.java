
package exercisesheet7;
import java.util.Scanner;
public class ExerciseSheet7 {

    public static void main(String[] args) {
     float BankBalance=0.0f;
     
     //Create a scanner object
     Scanner in= new Scanner (System.in);
     
     //Header
     System.out.print("Interest or Overdraft rate calculator");
     System.out.print("---------------------------------");
     
     //Request User input
     System.out.println("Please enter your bank balance?");
     BankBalance= in.nextFloat();
     
     if (BankBalance >=1000){
     System.out.println("10% interest rate");    
     }
     else if ((BankBalance >=200)&&(BankBalance <=999.99)) {
     System.out.println("5% interest");
     }
     else if ((BankBalance>0.01)&&(BankBalance <=199.99)) {   
     System.out.println("1% interest");
     }  
     else if (BankBalance ==0) {
     System.out.println("N/A");
    }
     else if (BankBalance<0) {
     System.out.println("13% overdraft charge");
    }
     
     
    }// end of main
    
} // end of class
