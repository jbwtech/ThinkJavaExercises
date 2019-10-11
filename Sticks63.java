public class Sticks63
{
    public Sticks63()
    {
    }

    public void main(String[] args) {
        int l1 = 3, l2 = 4, l3 = 7;
        
        System.out.printf("The three lengths are %d, %d, and %d%n", l1, l2, l3 );
        
        if( canBeTriangle( l1, l2, l3 ) ) {
            System.out.println("You can make a triangle with those lengths.");
        } else {
            System.out.println("You cannot make a triangle with those lengths.");
        }
    }
    
    private boolean canBeTriangle(int a, int b, int c) {
        //
        if ( a >= b + c ) {
            return false;
        } else if ( b >= a + c ) {
            return false;
        } else if ( c >= a + b ) {
            return false;
        } else {
            return true;
        }
    }
}
