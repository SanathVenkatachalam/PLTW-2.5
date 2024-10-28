/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */

  /* your code here - constructor(s) */ 
  public Player(){
    System.out.println("Enter player name: ");
    Scanner scanner = new Scanner(System.in);
    String newName = scanner.nextLine();

    name = newName;
    System.out.println("Hello and welcome to the game " + name);

  }
  public Player(String inputName){
    name = inputName;
    System.out.println("Hello and welcome to the game " + name);
  }

  /* your code here - accessor(s) */ 

  /* your code here - mutator(s) */ 
}