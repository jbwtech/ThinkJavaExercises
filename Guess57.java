import java.util.Scanner;
import java.util.Random;

public class Guess57
{

    public Guess57()
    {
    }

    public void main(String[] args) {
        int number;
        Random random = new Random();

        number = random.nextInt(100) + 1;

        System.out.println("I'm thinking of a number betweeon 1 and 100");
        System.out.println("(including both.) Can you guess what it is?");

	nextGuess( number );
    }

    private void nextGuess(int number) {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter a number: ");
        int guess = in.nextInt();

	if ( guess > number ) {
		System.out.println("Too high.  Guess again.");
	} else if ( guess < number ) {
		System.out.println("Too low.  Guess again.");
	} else {
		System.out.println("You guessed it!");
		return;
	}

	nextGuess( number );
    }
}
