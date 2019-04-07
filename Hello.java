
/**
 * Write a description of class Hello here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hello
{
    static int x;
    /**
     * Constructor for objects of class Hello
     */
    public Hello()
    {
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args)
    {
        System.out.println("\nThis is the public method \"main()\"");
        System.out.println("Hello World!");
        System.out.println("How are you?");
        getx();
    }
    
    private static void getx() {
        System.out.println("\nThis is the private method \"getx()\"");
        System.out.print("x = ");
        System.out.println(x++);
    }
}
