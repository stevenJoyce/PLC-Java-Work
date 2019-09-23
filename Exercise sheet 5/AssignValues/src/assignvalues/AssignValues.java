package assignvalues;

public class AssignValues {

    public static void main(String[] args) {
        // Declare and initialise variables
    String txt = "Fantastic";
    String lang = "Java";
    
    //assin concatenate string operator
    //joining two string together
    txt += lang ; //assign concatenated string
    System.out.println("add & assign strings" +txt);
    
    //declare and initialise variables 
    int sum=10;
    int num=20;
    sum += num;//assign result (10+20=30)
    System.out.println("Add & assign Intergers" +sum);
    
    // multiply and assign an integer
    int factor=5;
    sum*=factor;//assign result(30x5=150)
    System.out.println("Multiplication sum:" +sum);
    
    //divide and assign an integer
    sum/= factor;//assign result(150/5=30)
    System.out.println("Division sum:" +sum);
    
    }// end of main method
    
}//end of class
