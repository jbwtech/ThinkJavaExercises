import java.util.Scanner;

public class Fragment
{
    int age;
    String name;
    
    public Fragment()
    {
        age = 0;
        name = "";
    }

    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your age? ");
        age = in.nextInt();
        in.nextLine();
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);
    }
}
