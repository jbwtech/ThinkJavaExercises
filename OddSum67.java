public class OddSum67
{
    public static void main(String[] args) {
        System.out.println(oddSum(7));
    }
    
    public static int oddSum(int a) {
        int b = a;
        if( a >= 1 ) { 
            b = b + oddSum(b - 2); 
        } else {
            b++;
        }
        return b;
    }
}
