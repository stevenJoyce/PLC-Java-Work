
package jelly.test;

public class Jelly {
    // Instance Variables
    private String manufacturer;
    private float price;
    private String flavour;
    private float noOfCalories;
    private String expiryDate;
    
    //Constructors
    
    //Constructors with five arguments
    public Jelly(String manufacturer,float price,String flavour, 
    float noOfCalories,String expiryDate)
    {
        this.manufacturer=manufacturer;
        this.price=price;
        this.flavour=flavour;
        this.noOfCalories=noOfCalories;
        this.expiryDate=expiryDate;
    }//end of five arguments#
   
    //Constructor with four arguments
    public Jelly(String manufacturer,float price,String flavour, 
    float noOfCalories)
    {
        this(manufacturer,price,flavour,noOfCalories,"not specified");
    }//end of four arguments
    
    //Constructor with three arguments
      public Jelly(String manufacturer,float price,String flavour)
    {
        this(manufacturer,price,flavour,0.0f,"not specified");
    
    }//end of three arguments
    
      //Constructor with two arguments
        public Jelly(String manufacturer,float price)
    {
        this(manufacturer,price,"not specified",0.0f,"not specified");
    }//end of two arguments
    
    //Constructor with one argument    
      public Jelly(String manufacturer)
    {
        this(manufacturer,0.0f,"not specified",0.0f,"not specified");
    }//end of one argument
    
    //Constructor with no arguments  
      public Jelly()
    {
        this("not specified",0.0f,"not specified",0.0f,"not specified");  
    }//end of no arguements
    
    //Setters and Getters 
    public void setManufacturer(String Manufacturer)
    {
        this.manufacturer = manufacturer;
    }//end of set
    
    public String getManufacturer()
    {
        return manufacturer;
    }//end of get
    
    public void setprice(float price)
    {
        this.price = price;
    }//end of set price
    
    public float getPrice()
    {
        return price;
    }//end of get price
    
    public void setFlavour(String flavour)
    {
        this.flavour = flavour;
    }//end of set flavour
    
    public String getFlavour()
    {
        return flavour;
    }//end of get Flavour
    
    public void setNoOfCalories(float noOfCalories)
    {
        this.noOfCalories = noOfCalories;
    }//end of set noOfCalories
    
    public float getNoOfCalories()
    {
        return noOfCalories;
    }//end of get noOfCalories
    
    public void setExpiryDate(String expiryDate)
    {
        this.expiryDate = expiryDate;
    }//end of set ExpiryDate
    
    public String getExpiryDate()
    {
        return expiryDate;
    }//end of get ExpiryDate
    
    //Methods
    public String setIntructions()
    {
        return "Leave Jelly to set in a cool environment for 1hr";
    }//end of method
    
    public String toString()
    {
        return "Manufacturer: "+ manufacturer + "\n" + "Price: " + price + "\n" 
                + " Flavour: " + flavour + "\n" + "No.of Calories: " 
                + noOfCalories + "\n" + "Expiry Date: " + expiryDate;
    }//end of main
      
    
}//end of class
