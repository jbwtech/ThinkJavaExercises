
public class IncreaseArray
{
    public IncreaseArray()
    {
    }
    
    public static void main() {
        // define and array of ints
        int[] nums = { 0,1,2,3,4 };
        
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        
        System.out.println();
        System.out.println("The size of the nums[] array is " + nums.length);
        System.out.println();
        System.out.print("Adding elements to array...");
        
        for(int i = 5; i < 10; i++) {
            nums = addElement(nums, i);
        }
        
        System.out.println("done.");
        System.out.println();

        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }

        System.out.println();
        System.out.println("The size of the nums[] array is " + nums.length);
        
        System.out.println();
        System.out.print("Concatenating arrays...");
        
        nums = catArrays(nums, nums);
        
        System.out.println("done.");
        System.out.println();
        
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }

        System.out.println();
        System.out.println("The size of the nums[] array is " + nums.length);
    }
    
    private static int[] addElement(int[] originalArray, int x) {
        int[] newArray = new int[originalArray.length + 1];
        
        for(int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }
        newArray[ originalArray.length ] = x;
        
        return newArray;
    }
    
    private static int[] catArrays(int[] arr1, int[] arr2) {
        int[] newArray = new int[ arr1.length + arr2.length ];
        
        for(int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i];
        }
        
        for(int i = arr1.length; i < newArray.length; i++) {
            newArray[i] = arr2[i - arr2.length];
        }
        return newArray;
    }
}
