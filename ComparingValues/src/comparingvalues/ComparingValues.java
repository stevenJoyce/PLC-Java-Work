
package comparingvalues;

public class ComparingValues {

    public static void main(String[] args) {
        //Declare and initialise string variables
        String txt="Fantastic" ;
        String lang="Java" ;
        //Perform comparision of strings
        //store the result
        //Using the EQUALITY OPERATOR
        boolean state =(txt == lang); //assign test result
        System.out.println("String Equality Test:" +state);
        
        //Comparision for Inequality
        state= (txt != lang); //assign result
        System.out.println("String Inequality Test:" +state);
        
        //comparision of integer values
        int dozen = 12; //assign result
        int score = 20;
        
        state =(dozen> score);
        System.out.println("Less Than Test:"+ state);
        
        state = (dozen<score); //assign result
        System.out.println("Less Than Test:" + state);
    
    }// End of main
    
}//end of class
