
package passing.multiple.arguments.pg68;

public class PassingMultipleArgumentsPg68 {

    public static void main(String[] args) {
        // Check to see if user has put
        //in correct no. of arguments
        //if not exit program
    if( args.length !=3)
    {
        System.out.println("Wrong number of arguments");
        return ;
    }//end of if
    
    //convert the string representations
    //to numeric arguments integers
    int num1 = Integer.parseInt( args[0]);
    int num2 = Integer.parseInt( args[2]);
    
    //generating an output message
    String msg =args[0] + args[1] + args[2] + "=" ;
    
    //perform arithmetic
    //append the results to output to msg variable
    if  (args[1].equals("+"))       msg += (num1 + num2);
    else if (args[1].equals("-"))   msg += (num1 - num2);
    else if (args[1].equals("x"))   msg += (num1 * num2);
    else if (args[1].equals("/"))   msg += (num1 / num2);
    else msg = "Incorrect operator" ;
    
    //Dispay the result
    System.out.println( msg );
    
    //HOW TO RUN THE JAVA
    //run tab, 
    //set project configuration, run category 
    //arguements line put in the sum 
    }//end of main
    
}//rnd of class
