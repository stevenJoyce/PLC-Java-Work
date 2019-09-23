
package multi;

public class Multi {

    public static void main(String[] args) {
       String msg = "This is a local variable in the multi class";
    System.out.println( msg );
    
    //Output the contents of a class
    //String variable constants
    //named txt from a class called data
    System.out.println( Data.txt );
    
    //Call a method called "greeting" from the data class
    Data.greeting();
    
    //Call a method named "line" from the class "Draw"
    Draw.line();
    }//end of main
    
}//end of class
