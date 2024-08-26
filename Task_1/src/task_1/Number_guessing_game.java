package task_1;
import java.util.Random;
import java.util.Scanner;

public class Number_guessing_game {

	public static void main(String[] args) {
				  Scanner scanner=new Scanner(System.in);
				  Random random=new Random();
				  boolean PlayAgain=true;
				  int total_rounds=0;
				  int total_score=0;
				  System.out.println("Welcome to the Number Guessing Game Buddy!");
				  while(PlayAgain) {
					  total_rounds++;
					  int RandomNumber=random.nextInt(100)+1;
					  int attempts=0;
					  int max_num_attempts=6;
					  System.out.print("\nRound "+total_rounds+": Guess a random number between 1 to 100");
					  boolean has_Guessed_correctly=false;
					  
					  while(attempts<max_num_attempts && !has_Guessed_correctly) {
						  System.out.print("\nEnter your guess buddy:");
						  int user_guess=scanner.nextInt();
						  attempts++;
						  if(user_guess==RandomNumber) {
						  System.out.println("Congratulations,You nailed it!");
						  has_Guessed_correctly=true;
						  total_score+=(max_num_attempts-attempts+1);
						  }
						  else if(user_guess<RandomNumber){
							  System.out.println("Itz..Too low,Try Again Buddy!");
						  }
						  else { 
							  System.out.println("Itz..Too High,Try Again Buddy!");
						  }
						  }
					  if(!has_Guessed_correctly) {
						  System.out.println("Sorry!You've Used all your attempts. The Correct Number is"+RandomNumber);
					  } 
						  System.out.println("Do you want to try another round buddy!(yes/No)");
					      String Response=scanner.next();
					      PlayAgain=Response.equalsIgnoreCase("yes");
					  }
					  System.out.println("\n Game Over! You played "+ total_rounds+" rounds and scored "+total_score+" points.");
					  scanner.close() ;   
					  }
			}
					  
					 
