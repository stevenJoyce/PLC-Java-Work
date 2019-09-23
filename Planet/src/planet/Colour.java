
package planet;

public enum Colour {
  RED,YELLOW,BLUE; //each is an instance of colour
  
  public String toString()
  {
        String value ="";
        
        switch(this)
        {
            case RED : value = "Red"; break;
            case YELLOW : value = "Yellow"; break;
            case BLUE : value = "Blue"; break;
                
        }//end of switch
        return value;
  }//end of String toString
  
}//end of enum 
