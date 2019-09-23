
package chessboard;

public class ChessBoard {

    public static void main(String[] args) {
        //Create a 2-D array
        String[][] board = new String[8][8];
        
        
     //Define one Y point on each axis
       //top row
        board[7][7] = "R" ; 
        board[7][6] = "N" ;
        board[7][5] = "B" ;
        board[7][4] = "K" ;
        board[7][3] = "Q" ;
        board[7][2] = "B" ;
        board[7][1] = "N" ; 
        board[7][0] = "R" ;
        //second row
        board[6][7] = "P" ;
        board[6][6] = "P" ;
        board[6][5] = "P" ;
        board[6][4] = "P" ;
        board[6][3] = "P" ;
        board[6][2] = "P" ;
        board[6][1] = "P" ;
        board[6][0] = "P" ;
        //bottom row
        board[0][7] = "R" ;
        board[0][6] = "N" ;
        board[0][5] = "B" ;
        board[0][4] = "K" ;
        board[0][3] = "Q" ;
        board[0][2] = "B" ;
        board[0][1] = "N" ;
        board[0][0] = "R" ;
        //second last row
        board[1][7] = "P" ;
        board[1][6] = "P" ;
        board[1][5] = "P" ;
        board[1][4] = "P" ;
        board[1][3] = "P" ;
        board[1][2] = "P" ;
        board[1][1] = "P" ;
        board[1][0] = "P" ;
        board[2][0] = "-" ;
        
       
      for ( int i = 0 ; i < board.length ; i++ )
        {
            System.out.println("\n");
        
         for (int j = 0 ; j < board[0].length ; j++) 
        
         {
            System.out.print(board [i][j]+" ");
            
         }//end of second for-loop
        
        }//end of main for-loop    
    
    
 }//end of main
    
}//end of class
