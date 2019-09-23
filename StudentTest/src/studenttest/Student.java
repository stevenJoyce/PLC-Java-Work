
package studenttest;

public class Student {
    private int age;    //a more restricted access modifier
    
    //Setter Method
    public void setAge(int age)
    {
        //VALIDATE AGE
        if((age < 0) || (age > 110))
        {
            this.age = 12;     //default value set
        }//end of if
        else{
            this.age = age;     //go ahead and set the age
        }//end of else
    }//end of setter method
    
    //Getter Method
    public int getAge()
    {
        return this.age;
    }//end of getter method
    
}//end of class
