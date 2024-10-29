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

    String name = newName;
    System.out.println("Hello and welcome to the game " + name);
    int points = 0;

  }
  public Player(String inputName){
    String name = inputName;
    System.out.println("Hello and welcome to the game " + name);
    points = 0;
  }

  /* your code here - accessor(s) */ 
  public String getName(){
    return name;
  }
  public void setName(String inputName){
    return name;
  }
  public int getPoints(){
    return points;
  }
  public void addToPoints(int value){
    return points;
  }

  /* your code here - mutator(s) */ 
}