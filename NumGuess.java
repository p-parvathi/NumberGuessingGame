package random;
import java.util.*;

public class NumGuess {
	public static void  NumberGuessingGame() {
		Scanner sc = new Scanner(System.in);
		int number = 1+ (int)(100* Math.random());
		int a=3;
		boolean guessedCorrectly=false;
		System.out.println("choose a number between 1 to 100");
		System.out.println("you have"+ a + "attempts to guess a correct number" );
		System.out.println("____________");
		System.out.println("Let's Begin");
		System.out.println("___________");
		while(!guessedCorrectly) {
		
		for(int i=0;i<=a;i++) {
			System.out.println("Enter your Guess:");
			int guess=sc.nextInt();
			
			if(guess==number) { 
				System.out.println("Congratulations! You guessed the correct number in"+a+"attempts");
				guessedCorrectly=true;
				break;
			}
			else if(guess < number) {
				System.out.println("The number is greater than"+ guess);
			}
			else {
				System.out.println("The number is less than"+ guess);
			}
		}
		if(!guessedCorrectly) {
		
		System.out.println("You have exhausted all your attempts.");
		System.out.println("Do you want to continue guessing? (yes/no): ");
		String response=sc.next();
		if(!response.equalsIgnoreCase("yes")) {
			System.out.println("The Game is Over!");
		System.out.println("The correct answer was:"+ number);
		break;
		}
		}
		}
		sc.close();
		
		
	}

	public static void main(String[] args) {
		NumberGuessingGame();		

	}

}
