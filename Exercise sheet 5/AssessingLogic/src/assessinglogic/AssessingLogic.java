
package assessinglogic;

public class AssessingLogic {

    public static void main(String[] args) {
        //declare and initialise variables
        
        boolean yes = true;
        boolean no = false;
        System.out.println("Both YesYes True:" + (yes&&yes));
        System.out.println("Both YesNo True:" + (yes&&no));
        
        //To test if either condition sre true
        System.out.println("Either YesYes True:" + (yes||no ));
        System.out.println("Either YesNo True:" + (yes||no));
        System.out.println("Either NoNo True:" + (no||no));
        //To show an original and inverse value
        System.out.println("Original Yes Value:" + yes);
        System.out.println("Inverse Yes Value:" + !yes);
    }// end of main
    
}//end of class
