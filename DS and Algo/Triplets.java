// This program accepts an array and then prints Triplets where sum of 1st and 2nd element is equal to 3rd
// Example Array - {2,3,4,5,7} - triplets - [2,3,5] [3,4,7] [2,5,7]

import java.util.Arrays;

public class Triplets {
    public static void main(String[] args){

        System.out.println("Enter the number of elements in array");
        int n = Integer.parseInt(System.console().readLine());
        int a[] = new int[n];
        for(int i =0; i<n; i++){
            a[i] = Integer.parseInt(System.console().readLine());
        }
        printTriplets(a);

    }

    static void printTriplets(int[] arr){
        int sum = 0;
        int triple[] = new int[3];
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                sum = arr[i] + arr[j];
                for(int k= 0; k< arr.length; k++){
                    if( k == i || k == j)
                       continue;
                    else{
                        if(sum == arr[k]){
                            triple[0] = arr[i];
                            triple[1] = arr[j];
                            triple[2] = arr[k];
                            System.out.println(Arrays.toString(triple));
                        }
                    }
                }
            }
        }
    }
}
