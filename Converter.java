import java.util.Scanner;

public class Converter
{
    final double CM_PER_INCH = 2.54;
    int inch;
    double cm;
    Scanner in = new Scanner(System.in);
    
    public Converter()
    {
    }
    
    public void inchesToCent()
    {
        System.out.print("How many inches: ");
        inch = in.nextInt();
        
        cm = inch * CM_PER_INCH;
        System.out.print(inch + " in = ");
        System.out.println(cm + " cm");
    }
    
    public void doubleDivExample() {
        System.out.println( "Four thirds = " + (4.0 / 3.0) );
    }
    
    public void inchToCM() {
        inch = 100;
        cm = inch * CM_PER_INCH;

        System.out.printf( "%d in = %f cm\n", inch, cm);
    }
    
    public void cmToInch() {
        inch = (int)(cm / CM_PER_INCH);
        
        System.out.printf( "%f cm = %d in\n", cm, inch);
    }
}
