
//Question 12 of the Assignment 2 Find if matrix is magic matrix. Sum of all the row same

import java.util.*;
public class MagicMatrix {

    static boolean IsMagic(int[][] arr){
        int sum = 0;
        int[] firstsum = new int[arr.length];
        for ( int i = 0; i < arr.length; i++){
            for ( int j = 0; j < arr[i].length; j++){
                sum = sum + arr[i][j];
            }
            if( i > 0 ){
                if( firstsum[0] == sum ){
                    firstsum[i] = sum;
                    sum = 0;
                }
                else
                return false;
            }
            else{
                firstsum[i] = sum;
                sum = 0;
            } 
        }
        return true;
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
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size");
        int row = sc.nextInt();
        System.out.println("Enter the column size");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        System.out.println("Enter the elements of array");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printMatrix(arr);
        if(IsMagic(arr))
        System.out.println("Matrix is magic");
        else
        System.out.println("Matrix is not magic");
        sc.close();
    }
}