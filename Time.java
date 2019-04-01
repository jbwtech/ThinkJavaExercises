import java.util.Date;

/**
 * Write a description of class Time here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Time
{
    final int SECONDS_PER_MINUTE = 60;
    final int SECONDS_PER_HOUR = 3600;
    final int SECONDS_PER_DAY = 86400;

    int hour, minute, second;
    /**
     * Constructor for objects of class Time
     */
    public Time() {
        hour = 13;
        minute = 29;
        second = 0;
    }

    public void main() {
        int total = 0;

        total = (hour * SECONDS_PER_HOUR) + (minute * SECONDS_PER_MINUTE) + second;
        System.out.printf("The time is %d:%d\n", hour,minute);
        System.out.printf("It has been %d seconds since midnight.\n", total);
        System.out.printf("There are %d seconds remaining in the day.\n", (SECONDS_PER_DAY - total));
        System.out.printf("%f percent of the day has passed.\n", ((double)(total)/SECONDS_PER_DAY)*100);
    }

}
