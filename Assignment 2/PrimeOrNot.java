//Question 6 of the Assignment

import java.util.*;
public class PrimeOrNot {
    static boolean IsPrime(long n){
        if( n < 2){
            return false;
        }
        else{
            for(int i = 2; i<= Math.sqrt(n); i++){
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args){

        System.out.println("How many numbers you want to enter? " );
        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
        long[] arr = new long[size];
        System.out.println("Please Enter the positive integers");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextLong();
        }
        boolean[] prime = new boolean[size];
        for(int i = 0; i<size; i++){
            prime[i] = IsPrime(arr[i]);
        }
        System.out.println("Your Inputted Array = "+Arrays.toString(arr)+" and There Prime test = "+Arrays.toString(prime));
        sc.close();
    }
}
