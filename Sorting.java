
import java.util.Arrays;

public class Sorting {

    public static int[] bubbleSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1])
                {
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    public static int[] insertionSort(int[] arr){

        for(int i = 0; i < arr.length; i++){

            int hole = i;
            if(hole == 0)
                continue;
            while (hole != 0 && arr[hole] < arr[hole-1]){
                int temp = arr[hole];
                arr[hole] = arr[hole-1];
                arr[hole-1] = temp;
                hole--;
            }
        }
        return arr;
    }
    
    public static int[] mergeSort(int[] arr, int start, int end){ //The solution can be more optimised if we don't create many array and only play with indexes in both function

        // Array with 1 element always sorted
        if(start == end-1)
            return new int[]{arr[start]};

        int mid = (start+end)/2; //Dividing Array into 2 Parts

        int[] left = mergeSort(arr, start, mid); //Left array
        int[] right = mergeSort(arr, mid, end); //Right array
        
        return merge(left,right); //Merging Left and Right into a sorted array
        
    }

    public static int[] merge(int[] left, int[] right){
        int merged[] = new int[left.length + right.length]; //Merged array Length
        int i = 0, k = 0, j= 0; // i is for left array counter and k is inserting element into merged and j is for right array counter
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){ //if left is smaller then left element will be inserted and left count will increase else right
                merged[k] = left[i];
                i++;
            } else {
                merged[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length){ //if left array elements are left then they will be simply inserted in remaining spaces since they are already sorted
            merged[k] = left[i];
            i++;
            k++;
        }
        while(j <  right.length){ //same if right array elements are left
            merged[k] = right[j];
            j++;
            k++;
        }
        return merged; // finally returning merged array
    }

    public static int[] selectionSort(int[] arr){

        for(int i = 0; i < arr.length; i++){
            int min = i;
            for(int j=i+1; j < arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4,55,121,2,3,5,9,66};
        //System.out.println(Arrays.toString(insertionSort(arr)));

        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length)));
    }
    
}
