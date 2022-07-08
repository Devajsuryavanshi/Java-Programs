
// Question 4 of the Assignment

import java.util.*;
public class BiggestOf3 {
    public static void main(String[] args){

        System.out.println("Enter the 3 numbers");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i =0; i<3; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for ( int i = 0; i< 3; i++){
            if( arr[i] > max )
            max = arr[i];
        }
        System.out.println("Your array - "+Arrays.toString(arr) +" and max value in array = "+max);
        sc.close();
    }
}