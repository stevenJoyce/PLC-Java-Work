package readuserinput;
import java.util.Scanner;

public class Readuserinput {

    public static void main(String[] args) {
        //declare input variables 
    int a;
    float b;
    String s;
    
    //creating a object of the scanner class
    Scanner in= new Scanner(System.in);
    
    //String input
    System.out.print("Enter a string: ");
    s = in.nextLine();
    System.out.println("You entered a string " + s);
    
    //Read in an Interger value
    System.out.print("Enter a interger: ");
    a = in.nextInt();
    System.out.println("You entered an interger " + a);
    
    //Read in a Float value
    System.out.print("Enter a float");
    b = in.nextFloat();
    System.out.println("You entered a float " + b);
    
    }//end of main
    
}//end of class
