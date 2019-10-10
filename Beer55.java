import java.lang.Math;

public class Beer55
{
    public void main(String[] args) {
        singVerse(99);
    }
    
    private void singVerse(int beers) {
        
        if( beers > 0 ) {
            System.out.printf("%d bottles of beer on the wall,%n", beers);
            System.out.printf("%d bottles of beer,%n", beers);
            System.out.println("ya' take one down, ya' pass it around,");
            System.out.printf("%d bottles of beer on the wall.%n%n", beers - 1);
            singVerse(beers - 1);
        } else {
            singLastVerse();
        }
    }
    
    private void singLastVerse() {
        System.out.println("No bottles of beer on the wall,");
        System.out.println("no bottles of beer,");
        System.out.println("ya' can't take one down, ya' can't pass it around,");
        System.out.println("'cause there are no more bottles of beer on the wall!");
    }        
}
