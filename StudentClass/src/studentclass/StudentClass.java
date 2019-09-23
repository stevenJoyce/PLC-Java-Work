
package studentclass;

public class StudentClass {
private String name;
private String address;
private int age;
private float feesOwed;
private boolean goodAttender;

//Constructor with 5 arguements
public StudentClass(String name, String address, int age , float feesOwed ,boolean goodAttender)
{
    this.name = name;
    this.address = address;
    this.age= 0;
    this.feesOwed = 0.0f;
    this.goodAttender = true;
}

//Constructor with 4 arguements
public StudentClass(String name, String address, int age , float feesOwed)
{
     this(name,address,age,feesOwed,true);
}      

//Constructor with 3 arguments
public StudentClass(String name, String address, int age)
{
     this(name,address,age,0.0f,true);
}  

//getter and esetter methods
 public void setname(String name)
    {
        this.name = name;
    }
    public String getname()
    {
        return name;
    }
    
 public void setAddress(String address)
 {
     this.address = address;
 }
 
 public String getaddress()
 {
     return address;
 }
 
 public void setAge(int age)
 {
     this.age = age;
 }
 
public int age()
{
    return age;
}

public void setFeesOwed (float feesOwed)
{
    this.feesOwed = feesOwed;
}

public float feesOwed()
{
    return feesOwed;
}

public void goodAttender (boolean goodAttender)
{
    this.goodAttender = goodAttender;
}

public boolean goodAttender()
{
    return goodAttender;
}

 public String toString()
    {
        return "Name: "+ name + "\n" + "address: " + address + "\n" 
                + " Age : " + age + "\n" + "Fees Owed: " + feesOwed + "\n" +
                "Good Attender: " + goodAttender;
    }//end of toString
 
 


}//end of class
