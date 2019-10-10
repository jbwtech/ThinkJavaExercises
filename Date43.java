
/**
 * Write a description of class Date43 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Date43
{
    String day,month;
    int year,date;
    
    /**
     * Constructor for objects of class Date43
     */
    public Date43()
    {
        date = 31;
        day = "Sunday";
        month = "March";
        year = 2019;
    }

    public void main(String[] args)
    {
        printAmerican(day, date, month, year);
        printEuropean(day, date, month, year);
    }
    
    private void printAmerican(String day, int date, String month, int year) {
        System.out.println();
        System.out.println("American format:");
        System.out.printf("%s, %s %d, %d%n", day, month, date, year);
    }
    
    private void printEuropean(String day, int date, String month, int year) {
        System.out.println();
        System.out.println("European format:");
        System.out.printf("%s %d %s %d%n", day, date, month, year); 
    }
}
