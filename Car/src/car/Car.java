
package car;

public class Car {
//declare instance variables to represent the attributes of the class
    public String manufacturer;
    public String model;
    public float travelSpeed;
    public float topSpeed;
    public String fuelType;
    public int noOfSeats;
    
    //Declare methods to brepresent the actions / behaviours of a Car
    public void accelerate()
    {
        System.out.println("Speed up...");
    }
    
    public void brake()
    {
        System.out.println("Applying brakes...");
        //Reduce speed by 5km/ph
        travelSpeed -=5;
        
        System.out.println("Now travelling at:" + travelSpeed + "KM per hour.");
    }
    
    public void indicateLeft()
    {
        System.out.println("Indicate Left...");
    }
    
    public void indicateRight()
    {
        System.out.println("Indicate Right...");
    }
 
    public void changeGear()
    {
        System.out.println("Changing Gear...");
    }
    
    public void beep()
    {
        System.out.println("Beep...");
    }
    
}//end of class
