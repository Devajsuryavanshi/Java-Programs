import java.util.*;
public class QuickSortImplement {

    public static void main(String args[]){

        int[] arr = {8,5,77,44,23,532,546,33,66,1,22};
        quicksort(arr, 0, arr.length-1);
        System.out.print(Arrays.toString(arr));

    }

    static void quicksort(int arr[], int left, int right){

        if(left < right){

           var pivot = arr[(left+right)/2];
           var index = partitioner(arr, left, right, pivot);
           quicksort(arr, left, index-1);
           quicksort(arr, index, right);

        }
        else return;
    }

    static int partitioner(int arr[], int left, int right, int pivot){
        
        while( left <= right ){

        while(arr[left] < pivot )
            left++;
        
        while(arr[right] > pivot)
            right--;

        if( left <= right){
            arr = swap(arr,left, right);
            left++;
            right--;
        }
    }
    return left;
    }

    static int[] swap(int[] arr, int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }
    
}

