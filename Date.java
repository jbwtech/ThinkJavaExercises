
/**
 * Write a description of class Date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Date
{
    String day,month;
    int year,date;
    
    /**
     * Constructor for objects of class Date
     */
    public Date()
    {
        date = 31;
        day = "Sunday";
        month = "March";
        year = 2019;
    }

    public void main()
    {
        System.out.println("American format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);
        System.out.println("European format:");
        System.out.printf("%s %d %s %d\n", day, date, month, year); 
    }
}
