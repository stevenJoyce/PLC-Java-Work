
package casting1;

public class Casting1 {

    public static void main(String[] args) {
        // Question 1- No
        byte b= 4;
        int c=b;
        System.out.println(c);
        
        //Question 2-No
        short s=32000;
        double d=(double)s;//upcasting
        System.out.println(d);
        
        //Question 3-Yes 
        int i= 100_000;
        byte bb = (byte) i; //add byte() to i downcasting
        System.out.println(bb);
        
        //Question 4- No
        int ii= 100_000;
        byte bbb =(byte)i;//downcasting
        System.out.println(bbb);
       
        //Question 5-Yes 
        int j=3;
        short jj=(short)j;
        System.out.println(jj);
        
        //Question 6- No
        int k=45000;
        float f=k;
        System.out.println(f);
        
        //Question 7-Yes 
        float ff=1.5f;
        int z=(int)ff;
        System.out.println(z);
    
    }//end of main
    
}//end of class
