
package testbinarysearch;

public class TestBinarySearch 
{
    public static void main(String[] args) 
    {
        int[] myArray = {-31, -22, 1, 3, 6, 8, 9, 10, 17, 23};
      
        int t =  1;
      
        int p = binarySearch(myArray, t);
      
        if (p == -1)
        {
            System.out.println("element" + t + " not found");
        }
        else
        {
            System.out.println("element" + t + "found in position" + p);
        }
    }
    
    public static int binarySearch(int[] A, int target)
    {
        int left = 0;
        int size = A.length;
        int right = size-1;
        int found = -1;
        int mid;
      
        while (found == -1 && left<=right)
        {
            mid = (left + right) / 2;
            
            if (target < A[mid] )
            {
                right  = mid - 1;
            }
            else if (target > A[mid])
            {
                left =   mid + 1;
            }
            else
                found = mid;
        }
      
        return found;
            
    }
}
