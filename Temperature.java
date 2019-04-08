import java.util.Scanner;

public class Temperature
{
    public Temperature()
    {
    }

    public void main(String[] args) {
        double celsius;
        double farenheit;
        Scanner in = new Scanner(System.in);
        
        System.out.printf("Enter celsius degrees: ");
        celsius = in.nextDouble();
        System.out.printf("You entered %.2f degrees for celsius.\n", celsius);
        
        farenheit = celsiusToFarenheit( celsius );
        System.out.printf("%.2f C = %.2f F\n", celsius, farenheit );
    }
    
    private double celsiusToFarenheit(double c) {
        double factor;
        
        factor = 9.0 / 5.0;
        return (c * factor) + 32;
    }
}
