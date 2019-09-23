
package doingmathematicspg83;

public class DoingMathematicsPg83 {

    public static void main(String[] args) {
        //declare and initialize a float variable
        //from command line Arguement
        float radius = Float.parseFloat(args[0]);
        float shortPi=(float) Math.PI;
        
        //perfom mathematical calculation
        //using the cast value, assigning the results
        //to more float variables
        float circ=shortPi*(radius+radius);
        float area=shortPi*(radius*radius);
        
        //Output the Pi value & cast float equivalent
        System.out.print("with Pi command from"+ Math.PI);
        System.out.println("to"+shortPi+"...");
        System.out.println("A circle of radius"+radius+"cm");
        System.out.print("has a circumference of"+circ+"cm");
        System.out.println("and an area of"+area+"sq.cm");
        
        
        
    }//end of main
    
}//end of clas
