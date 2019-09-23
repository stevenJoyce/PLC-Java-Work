
package numberguessgametest;

public class NumberGuessGameTest {

    //declare instance 
    //variables
    private int randomNumber;
    public int playerGuess;
    
    //create a constructor
    //for NumberGuessGame
    public NumberGuessGameTest()
    {
        System.out.println("\nNumber Guessing Game!\n");
        playerGuess = 0;
        randomNumber = getRandomNumber();
    }//end of numberGuessGame
    
    //public methods
    //generate a random number between 1-10
    public int getRandomNumber()
    {
        randomNumber = (int) Math.ceil(Math.random()*10);
        return randomNumber;
    }//end of public randomNumber
    
    //tell the player if they have or have not 
    //guessed the number correctly
    public void play()
    {
        //getRandomNumber();
        
        if (playerGuess ==randomNumber)
        {
            System.out.println("You guessed correct with: "+playerGuess);
        }//end of if
        else
        {
            System.out.println("You guessed incoreectly with:" +playerGuess);
            System.out.println("The correct value was: " +randomNumber);
        }//end of else
    }//end of public void play
    
}//end of class
