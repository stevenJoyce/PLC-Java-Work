
package jelly.test;

public class JellyTest {

    public static void main(String[] args) {
        //1st jelly sweet
        //create a jelly object
        //Use five argument constructor!
        Jelly j1 = new Jelly("Chivers" , 1.25f , "lemon" , 110f , "26/11/15 ");
        
        //Output instructions for j1 Jelly object
        System.out.println(j1.setIntructions());
        
        //Output information relating to j1 object
        System.out.println(j1.toString());
        
        //second jelly sweet
        //create a second jelly object
        //Use a three arguement constructor!
        Jelly j2 = new Jelly("Bassett ", 2.35f , " orange ");
        
        //Output information relating to j2 object
        System.out.println(j2.toString());
        
        //Set not specified information
        //Use setter methods
        j2.setNoOfCalories(400f);
        j2.setExpiryDate("31/12/2015");
        
        //Output updated information
        System.out.println(j2.toString());
        
        //third jelly sweet
        //Create a third jelly object
        //Use a one arguement constructor!
        Jelly j3 = new Jelly("Haribo ");
        
        //Set not specified information
        //Use saetter methods
        j3.setprice(0.01f);
        j3.setFlavour("Yummy");
        j3.setNoOfCalories(200f);
        j3.setExpiryDate("NEVER!");
        
        //Output the flavour of the jelly
        //Use the getter method
        System.out.println("Flavour of Jelly 3 is: " + j3.getFlavour());
                
    }//end of main
    
}//end of class
