
// Question number 11 of the Assignment 2. Sum of 2 Matrix of size NxN

import java.util.*;
public class MatrixSum {

    public static final Scanner sc = new Scanner(System.in);
     
    // This is a method to take square matrix input from the user.
    static int[][] arrayInput(int size){
        int[][] arr = new int[size][size];
        for( int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
     
    //Method to Print the array
    static void printMatrix(int[][] arr){
        for( int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){

        System.out.print("Enter the size of the array - ");
        int size = sc.nextInt();
        System.out.println("Enter the Elements of first arrray ");
        int[][] arr1 = arrayInput(size);
        System.out.println("Enter the Elements of Second array");
        int[][] arr2 = arrayInput(size);
        int[][] sum = new int[size][size];
        
        //Sum of array.
        for( int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("First Matrix");
        printMatrix(arr1);
        System.out.println("Second Matrix");
        printMatrix(arr2);
        System.out.println("Their Sum");
        printMatrix(sum);
    }
}
