
package planet;

public class Planet {
    private String name;
    private Colour colour;
    private String galaxy;
    
    //Constructor
    public Planet(String name,Colour colour,String galaxy)
    {   this.name= name;
        this.colour= colour;
        this.galaxy= galaxy;    
    }
    
    public void setname(String name)
    {
        this.name = name;
    }
    public String getname()
    {
        return name;
    }
    
    public void setColour(Colour colour)
    {
        this.colour = colour;
    }
    public Colour getColour()
    {
        return colour;
    }
   
    public void setgalaxy(String galaxy)
    {
        this.galaxy = galaxy;
    }
    public String getgalaxy()
    {
        return galaxy;
    }
    
    public String toString()
    {
        return"Planet name: "+this.getname() + "\nPlanet colour: " + 
        this.getColour() + "\ngalaxy: "+ this.getgalaxy() +"\n";
    }//end of string toString
    
}//end of class
