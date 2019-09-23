
package ternaryoperator;

public class TernaryOperator {

    public static void main(String[] args) {
        // declare and initialise
        //two interger variables
        int num1 = 1357;
        int num2 = 2468;
        
        //store test result
        String result;
        
        //determine whether the first integer
        //value is an odd or even number
        result = (num1%2!=0)? "Odd" : "Even" ;
        System.out.println( num1 + "is " + result);
        
        result = (num2%2!=0)? "Odd" : "Even" ;
        System.out.println( num2 + "is " + result);
        
        
        
    }//end of main
    
}//end of class
