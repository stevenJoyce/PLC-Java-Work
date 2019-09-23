
package numberguessgametest;

import java.util.Scanner;

public class NumberOfGuessGameTest {

    public static void main(String[] args) {
        
        //Create intance of the 
        //Number Guess Game class
        NumberGuessGameTest myGame = new NumberGuessGameTest();
        
        //Create Scanner Object
        Scanner in = new Scanner(System.in);
        
        //read in user guess
        System.out.println("Please enter your guess (1-10): ");
        myGame.playerGuess=in.nextInt();
        
        System.out.println();
        
        //Play number guessing game
        myGame.play();
    
    
    
    
    
    
    }//end of main
           
}//end of class
