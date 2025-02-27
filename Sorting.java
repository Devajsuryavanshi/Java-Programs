
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
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    
}
