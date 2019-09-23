
package marsdelay;

public class MarsDelay {

    public static void main(String[] args) {
        //Declare constants and variables
        final int EarthtoMars = 34000000;
        final int SpeedOfLight = 186000;
        
        //Calculate delay in seconds
        float delayinSeconds = EarthtoMars/SpeedOfLight;
       
        //Display total delay in seconds
       System.out.println(" Delay from EarthtoMars: ") ;
       System.out.println(delayinSeconds + " total seconds delay") ;
       
       //Calculate delay in minutes
       float delayinMinutes = EarthtoMars/SpeedOfLight/60;
       
       //Display total delay in minutes
       System.out.println(" Delay from EarthtoMars:/60") ;
       System.out.println(delayinMinutes + " total minutes delay") ;
       
       //Display remainder delay in seconds
       System.out.println("and" +delayinSeconds%60 + " seconds delay") ;
    
    
    }// End of main
    
}//End of class
