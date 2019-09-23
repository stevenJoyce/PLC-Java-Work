
package savings.current.account.sheet.pkg8;
import java.util.Scanner;
public class SavingsCurrentAccountSheet8 {

    public static void main(String[] args) {
    float CurrentAccount=0.0f;
    float SavingsAccount=0.0f;
    float balance=0.0f;
    float interest=0.0f;
    float overdraft=0.0f;
            
    //Create scanner object
    Scanner in= new Scanner (System.in);
    
    //Header
    System.out.print("Savings and Current Account Interest Calculator");
    System.out.print("------------------------------------------");
    
    //Request User Input
    System.out.print("Please enter your Current Account Balance:");
    CurrentAccount=in.nextFloat();
    System.out.print("Please enter your Savings Account Balance");
    SavingsAccount=in.nextFloat();
    
    
    if (CurrentAccount <0){
    System.out.println("12% Overdraft rate");
    
    
   
    }
    else if (CurrentAccount >0){
   System.out.println("1% Interest rate");
    
    
    }
      
    if (SavingsAccount <0){
    System.out.println("Error");
    }        
    else if (SavingsAccount <=1000){
    System.out.println("1.5% Interest rate");
    } 
    else if (SavingsAccount >1000){
    System.out.println("5% Interest rate");
    }
    
    
    }//end of main
    
}// end of class
