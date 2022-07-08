
import java.util.*;
public class MatrixMult {

    public static final Scanner sc = new Scanner(System.in);
    

    static void printMatrix(int[][] arr){
        for( int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int[][] inputMatrix(int row, int col){

        int [][] arr = new int[row][col];

        for( int i = 0; i < row; i++){
            for ( int j = 0; j < col; j++){
                arr[i][j]  = sc.nextInt();
            }
        }
        return arr;
    }

    static int[][] multMat(int[][] arr1, int[][] arr2){

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

    public static void main(String[] args){

        System.out.println("Enter the number of rows in first array");
        int row1 = sc.nextInt();
        System.out.println("Enter the number of column in First array");
        int col1 = sc.nextInt();
        System.out.println("Enter the number of rows in second array");
        int row2 = sc.nextInt();
        System.out.println("Enter the number of columns in second array");
        int col2 = sc.nextInt();

        if (col1 == row2){

        System.out.println("Enter the Matrix 1 elements");
        int[][] arr1 = inputMatrix(row1, col1);

        System.out.println("Enter the elements of second array");
        int[][] arr2 = inputMatrix(row2, col2);

        int[][] multiply = multMat(arr1, arr2);

        System.out.println("first matrix -");
        printMatrix(arr1);

        System.out.println("Second Matrix");
        printMatrix(arr2);

        System.out.println("Multiplication = ");
        printMatrix(multiply);

        }
        else
        System.out.println("Enter the valid matrix length for possible multiplication");


    }
}
