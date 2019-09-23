
package array.pg65;

public class ArrayPg65 {

    public static void main(String[] args) {
        // Declare and Initialize a string array with 3 elements(known values)
        String[] str = {" Much ", " More ", " Java "} ;
        
        //Delcare an empty interger array (unknown values)
        int[] num= new int[3] ;
        
        // Assign two interger values
        num[0] = 100 ;
        num[1] = 200 ;
        
        //Assign new value to second String array element (change more)
        str[1] = " Better ";
        
        //Output length of each array
        //Output contents of all elements of each array
        System.out.println("String array length is " + str.length );
        System.out.println("Interger array length is " + num.length );
        System.out.println(num[0] + " , " + num[1] + " , "+ num[2]);
        System.out.println(str[0] + str[1] + str[2] );
        
        
    
     }//end of main
    
}//end of class
