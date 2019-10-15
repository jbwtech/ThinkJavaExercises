public class Ack68
{
    public static void main(String[] args) {
        long m, n;
        for(m = 0; m <= 4; m++) {
            for(n = 0; n < (6-m); n++) {
                System.out.printf("A(%d, %d) = %d\n", m, n, ack(m, n));
            }
        }
    }
    
    public static long ack(long m, long n) {
        
        if( m == 0 ) { 
            return n + 1;
        } else if ((m > 0) && (n == 0)) {
            return ack(m - 1, 1);
        } else if ((m > 0) && (n > 0)) {
            return ack(m - 1, ack(m, n - 1));
        } else {
            return 0;
        }
    }
}
