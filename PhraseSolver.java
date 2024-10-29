/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */

  /* your code here - constructor(s) */
  public PhraseSolver(){
    Player player1 = new Player();
    Player player2 = new Player();
    Board board = new Board();
    boolean solved = false;

  } 

  /* your code here - accessor(s) */
  player1.setName("player 1");
  player2.setName("player 2");
  /* your code here - mutator(s)  */

  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {
      //get a phrase
      board.loadPhrase();
      //display name of player
      System.out.println("Current Player: " + player1.getName());
      //display player's guessed letter
      System.out.println("Guessed Letter " + board.guessLetter("a"));
      //set a Letter value
      board.setLetterValue();
      //Display letter value
      System.out.println("Letter value: " + board.getLetterValue());
      //display partially solved phrase
      System.out.println("Current state of phrase: " + board.getPartiallySolvedPhrase());
      



      
      /* your code here - game logic */

      
      
      /* your code here - determine how game ends */
      solved = true; 
    } 
   
  }
  
}