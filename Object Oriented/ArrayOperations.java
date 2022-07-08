import Utilities.ArrayUtils;
public class ArrayOperations {
    
    public static void main(String args[]){

        System.out.println("Enter the elements of 4 X 4 Matrix");

        int[][] arr = ArrayUtils.inputMatrix(4,4);

        System.out.println("Original Matrix");

        ArrayUtils.printMatrix(arr);

        System.out.println("Swapped Matrix - ");

        ArrayUtils.printMatrix(SwapFirstLastRow(arr));

    }

static int[][] SwapFirstLastRow(int[][] arr){

    int row = arr.length;
    int col = arr[0].length;
    int row1 = 0;
    int[][] arr2 = new int[row][col];

    for(int i = 0; i< row; i++){

        if( i == 0 )
            row1 = row -1;

        else if(i == arr.length - 1)
            row1 = 0;
        else 
            row1 += 1;

        for(int j = 0; j<col; j++)
            arr2[row1][j] = arr[i][j]; 
        
        row1 = i;
    }
    return arr2;
}

}