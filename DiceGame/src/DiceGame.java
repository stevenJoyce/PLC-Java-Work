
public class DiceGame {

    //declare instance variable
    //to represent the dice
    private int dice;
    
    //create a constructor 
    //for the DiceGame
    //creates game heading
    //and initialises dice
    public DiceGame()
    {
        System.out.println("\nGame of Dice");
    }//end of public DiceGame
    
    //declare methods to represent the
    //actions or behaviours of 
    //the Dice Game
    public int rollDice()
    {
        dice = (int) Math.ceil(Math.random()*6);
        return dice;
    }//end of public int rollDice
    
    public void play()
    {
            //odd numbers lose
            //even numbers win the game
            rollDice();
            
            if (dice ==1 || dice ==3 || dice ==5)
            {
                System.out.println("Loss with: "+dice);
            }//end of if
            else if (dice ==2 || dice ==4 || dice ==6)
            {
                System.out.println("Win with: "+dice);
            }//end of else
    }//end of public void play
    
}//end of class
    

