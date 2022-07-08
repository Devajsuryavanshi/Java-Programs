
import java.util.*;
public class TransposeMatrix {

    static void printMatrix(int[][] arr){
        for( int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row size of the Matrix");
        int row = sc.nextInt();
        System.out.println("Enter the column size of the Matrix");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        int[][] transpose =  new int[col][row];

        System.out.println("Enter the elements of Matrix");

        for(int i = 0; i < row; i++){
            for( int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
                transpose[j][i] = arr[i][j];
            }
        }

        System.out.println("Inputted Matrix");
        printMatrix(arr);
        System.out.println("Transpose-");
        printMatrix(transpose);
        sc.close();
    }
}
