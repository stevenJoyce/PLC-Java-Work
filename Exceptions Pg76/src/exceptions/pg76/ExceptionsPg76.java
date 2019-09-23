
package exceptions.pg76;

public class ExceptionsPg76 {

    public static void main(String[] args) {
        //try to output a single arguement
    try
    {
        int num = Integer.parseInt( args[0]);
        System.out.println("You entered: " +num);
    }//end of try
    
    //to handle the exception that arises
    //when program is run without an argument
    catch( ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Integer argument required. ") ; 
    }//end of catch    
    
    //Occurs if the program
    //is run with a non-Intefer argument
    catch( NumberFormatException e)
    {
        System.out.println("Argument is wrong format. ") ;  
    }//end of 2nd catch
    
    //Code that will always execute
    //regardless of any error message
    finally 
    {
        System.out.println("Program ends. ") ; 
    }//end of finally
    
     //HOW TO RUN THE JAVA
    //run tab, 
    //set project configuration, run category 
    //arguements line put in the sum or words in capital
    
    
    }//end of main
    
}//end of class
