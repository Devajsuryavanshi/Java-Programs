import java.util.Arrays;

public class MergeSortImplement{

    public static void main(String args[]){

        int[] arr = {22,44,53,123,434,55,332,1,23,9,0,12};
        MergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Merge(int[] left, int[] right, int[] arr){

    int left_len = left.length;
    int right_len = right.length;
    int i=0, j=0, k = 0;
    
    while( i < left_len && j < right_len){

        if( left[i] <= right[j]){
            arr[k] = left[i];
            i++;
        }
        else{
            arr[k] = right[j];
            j++;
        }
        k++;
    }
    //Checking the remaining elements of left if available.
    while( i < left_len || j < right_len){
        
        if(i < left_len){
            arr[k] = left[i];
            i++;
            k++;
        }
        else{
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
    static void MergeSort(int arr[]){

        int len = arr.length;
        if(len < 2) return;

        int mid = len/2;
        int left[] = new int[mid];
        int right[] = new int[len-mid];

        for(int i = 0; i < len; i++){
            
            if(i < mid)
                left[i] = arr[i];  
            else
                right[i-mid] = arr[i];
        }

        MergeSort(left);
        MergeSort(right);
        Merge(left, right, arr);
    }
}