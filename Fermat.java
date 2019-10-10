import java.lang.Math;

public class Fermat
{
    public void main(String[] args) {
        checkFermat( 3, 4, 5, 3);
    }
    
    private void checkFermat(int a, int b, int c, int n) {
        //
        double sum = Math.pow(a, n) + Math.pow(b, n);

        if( Math.pow( c, n) == sum ) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work.");
        }
    }
}
