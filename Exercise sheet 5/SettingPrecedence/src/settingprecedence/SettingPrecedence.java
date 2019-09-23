
package settingprecedence;

public class SettingPrecedence {

    public static void main(String[] args) {
        //Declare and Initialise an 
        //integer variable with the  
        //result of an expression
        //uing default precendence
    
        int sum = 32-8+16*2;//16x2=32, +24=56
        System.out.println("Default order:" +sum );
       
        //assign the interger variable
        //the result of the same expression
        //where addition and subtraction
        //operations now have precedence
        //over multiplication
       
        sum = (32-8+16)*2;//24+16=, x2=80
       System.out.println("Specified order:"+ sum );
   
       sum =(32-(8+16))*2; //32-24+8,x2=16
       System.out.println("Nested specific order:" + sum);
    
    }//end of main
    
}//end of class
