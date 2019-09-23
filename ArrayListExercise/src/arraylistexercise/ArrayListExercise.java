
package arraylistexercise;
import java.util.ArrayList;
public class ArrayListExercise {

    public static void main(String[] args) {
     ArrayList<String>planets = new ArrayList<>();
    planets.add("Earth");
    planets.add("Mars");
    planets.add("Venus");
    planets.add("Mercury");
    planets.add("Neptune");
    planets.add("Sun");
    planets.add("Saturn");
    planets.add("Jupiter");
    
    for(int i=0; i < planets.size(); i++)
    {
        System.out.println(planets.get(i));
    }//end of for-loop
    
     if(planets.contains("Sun"))
      {
          
          planets.remove("Sun");
          System.out.println("Sun is removed from the list!");
      }//end of if
      
     
     for(int i=0; i < planets.size(); i++)
    {
        System.out.println(planets.get(i));
    }//end of for-loop
     
     planets.add(2,"Pluto");
     System.out.println("Pluto is added to the list!");
     
     for(int i=0; i < planets.size(); i++)
    {
        System.out.println(planets.get(i));
    }//end of for-loop
     
     
    }//end of main
    
}//end of class
