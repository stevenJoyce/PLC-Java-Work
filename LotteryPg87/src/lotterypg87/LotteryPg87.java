
package lotterypg87;

public class LotteryPg87 {

    public static void main(String[] args) {
        // TODO code application logic here
    int[] nums = new int[50];
    for( int i = 1; i < 50; i++) { nums[i] = i;}
    
    for ( int i = 1 ; i < 50; i++ )
    {
        int r = (int) Math.ceil( Math.random()*49);
        int temp = nums[i];
        nums[i] = nums[r];
        nums[r] = temp ; 
    }
    
    for (int i = 1; i < 7 ; i++)
    {
        System.out.print( Integer.toString( nums[i]) + " ");
    }
    
    }//end of main
    
}//end of class
