
package addingarraydimensionspg75;

public class AddingArrayDimensionspg75 {

    public static void main(String[] args) {
        //create a 2-D boolean array 
        //to store X,Y Co-ordinates
        //default array elements set to false
        boolean[][] points= new boolean[5][20] ;
        
        //Define one Y point on each axis
        points[0][5] = true ;
        points[1][6] = true ;
        points[2][7] = true ;
        points[3][8] = true ;
        points[4][9] = true ;
        
        //For-loop to interate through first array index
        //adding a new line character at the 
        //end of each iteration
        for ( int i = 0 ; i < points.length ; i++ )
        {
            System.out.print( "\n");
            
         //create a second for-loop inside the 1st for-loop
         //to output a character for each element
         //according to the elements boolean value
         for (int j = 0 ; j < points[0].length ; j++) 
        //zero accesses 2nd array[20] 
         {
             char mark = ( points [i][j])? 'X':'-';
             System.out.print( mark );
         }//end of second for-loop
        
        }//end of main for-loop    
        
        
    }//end of main
    
}//end of class
