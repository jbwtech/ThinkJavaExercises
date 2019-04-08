import java.util.Scanner;

public class Seconds
{
    public Seconds()
    {
    }

    public void main(String[] args) {
        int day,hour, minute, second, totalSeconds;
        final int SECONDS_PER_DAY = 86400;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number of seconds: ");
        totalSeconds = in.nextInt();
        second = totalSeconds;
        
        day = second / SECONDS_PER_DAY;
        second = second % SECONDS_PER_DAY;
        
        hour = second / SECONDS_PER_HOUR;
        second = second % SECONDS_PER_HOUR;
        
        minute = second / SECONDS_PER_MINUTE;
        second = second % SECONDS_PER_MINUTE;
        
        System.out.printf("%d seconds = %d day(s), %d hour(s), %d minute(s), and %d seconds\n",
            totalSeconds, day, hour, minute, second);
    }
}
