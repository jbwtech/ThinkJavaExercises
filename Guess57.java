import java.util.Scanner;
import java.util.Random;

public class Guess57
{

    public void main(String[] args) {
        Random random = new Random();

        System.out.println("\nI'm thinking of a number between 1 and 100");
        System.out.println("(including both.) Can you guess what it is?");

	nextGuess( random.nextInt(100) + 1 );
    }

    private void nextGuess(int number) {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter a number: ");
        int guess = in.nextInt();

	if ( guess > number ) {
		System.out.println("Too high.  Guess again.\n");
	} else if ( guess < number ) {
		System.out.println("Too low.  Guess again.\n");
	} else {
		System.out.println("You guessed it!\n");
		return;
	}

	nextGuess( number );
    }
}
