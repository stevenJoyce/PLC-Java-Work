
package option;

public class Option {

    public static void main(String[] args) {
      
    if (args[0].equals( "-en" ))
    {
        System.out.println( " English option " );
    }
    
    else if (args[0].equals( "-es" ))
    {
        System.out.println( " Spainish Option " );
    }
    
    else System.out.println( " Unrecognised option " );
    
    //HOW TO RUN THE JAVA
    //run tab, 
    //set project configuration, run category 
    //arguements line put in "-e(n,s,z)" 
    }//end of main
    
}//end of class
