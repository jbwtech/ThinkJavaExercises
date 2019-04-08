import java.util.Scanner;
import java.util.Random;

public class Guess
{
    
    public Guess()
    {
    }

    public void main(String[] args) {
        int number, guess;
        Random random = new Random();
        
        number = random.nextInt(100) + 1;
        Scanner in = new Scanner(System.in);
        
        System.out.println("I'm thinking of a number betweeon 1 and 100");
        System.out.println("(including both.) Can you guess what it is?");
        System.out.print("Enter a number: ");
        guess = in.nextInt();
        
        System.out.printf("Your guess was %d\n", guess);
        System.out.printf("The number I was thinking of is %d\n", number);
        System.out.printf("Your were off by %d\n", number - guess);
    }
}
