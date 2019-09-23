
package maritalstatus;
import java.util.Scanner;

public class MaritalStatus {

    public static void main(String[] args) {
        // TODO code application logic here
     
       String MaritalStatus="D";
       
       Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter your Marital status:");
        String userInput = in.nextLine();
       
       switch (MaritalStatus) 
            {  
            case "D":
               System.out.print("status: divorced");
                break;
            case "S":
               System.out.print("status: single");
                break;
             case "M":
                System.out.print("status: married");
                break;
             case "W":
                 System.out.print("status: widowed");
                   break; 
            default:
                System.out.print("Invalid Date");
            }
    
  
    }//end of main
    
}//end of clas
