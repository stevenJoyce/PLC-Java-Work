
package casting.ex2;

public class CastingEx2 {

    public static void main(String[] args) {
       //casting and Promotion Examples
        
        //Promotion Example 1
        //Division
        int num1=10;
        double num2=3; //(change)Promote 3 from interger to double
        double num3;
        num3= num1 / num2;
        System.out.println(num3);
        
        //Casting Example 1
        //Widening/upcasting
        int num4= 7;
        int num5= 2;
        double num6;
        num6= (double) num4 / num5;//tempor promote num4 to double 4 calulation
        System.out.println(num6);
        
        
        //Promotion Example 2
        //Multiplication
        int num7=55555;
        double num8=66666;//(change)Promote 3 from interger to double
        double num9;
        num9 = num7 * num8;
        System.out.println(num9);
        
        //Casting Example 2
        
        int num10 = 55555;
        int num11 = 66666;
        double num12;
        num12= (double)num10 * num11;//tempor promote num10 to double 10 calulation
        System.out.println(num12);
    
    
    
    
    }// end of main
    
}//end of class
