import java.util.*;
public class BinarySearch {
    
    static int binarySearch(int[] arr, int num){

        int Left  = 0;
        int Right = arr.length - 1;
        
        while( Left <= Right ){

            int mid = (Left + Right)/ 2;

            if(arr[mid] == num)
               return mid;

            else if(num < arr[mid])
               Right = mid - 1;

            else
                Left = mid + 1;
        }
        return -1;
    }

    public static void main(String args[]){
        
        int[] a = {8,6,4,3,22,56,10,23};
        Arrays.sort(a);
        int toSearch = 56;
        int index = binarySearch(a, toSearch);
        System.out.println(Arrays.toString(a));
        if( index == -1) System.out.println("Not found");

        else System.out.println("Found at position - "+index + " of the sorted array");
    }
}
