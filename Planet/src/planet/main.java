
package planet;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
     //Create the planet Earth object 
     Planet Earth = new Planet("Earth", Colour.BLUE,"Milky Way");
     //Create the planet Mars object
     Planet Mars = new Planet("Mars", Colour.RED, "Milky Way");
     //Create the planet Kelt-1b object
     Planet Kelt1b = new Planet ("Kelt-1b", Colour.YELLOW, "Andromeda");
    
      //Declare and initialize new String Arraylist
     ArrayList<Planet> planets = new ArrayList<Planet>();
     
     planets.add(Earth);
     planets.add(Mars);
     planets.add(Kelt1b);
     
      for(int i=0; i < planets.size(); i++)
    {
        System.out.println(planets.get(i));
    }//end of for-loop

    
    }//end of main
    
}//end of class
