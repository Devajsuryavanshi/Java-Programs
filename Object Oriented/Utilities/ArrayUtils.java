package Utilities;

import java.util.Scanner;
public class ArrayUtils {

    public static final Scanner sc = new Scanner(System.in);
    
    public static void printMatrix(int[][] arr){
        for( int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] inputMatrix(int row, int col){

        int [][] arr = new int[row][col];

        for( int i = 0; i < row; i++){
            for ( int j = 0; j < col; j++){
                arr[i][j]  = sc.nextInt();
            }
        }
        return arr;
    }

    public static int[] bubble_sort(int[] arr){

        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                
                if( arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        return arr;
    }

    public static int[][] multMat(int[][] arr1, int[][] arr2){

        int[][] mult = new int[arr1.length][arr2[0].length];

        for(int i = 0; i < mult.length; i++){

            for(int j = 0; j<mult[i].length; j++){

                for(int k = 0; k < arr1[0].length; k++){

                    mult[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return mult;
    }
}
