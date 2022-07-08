import java.util.*;
public class VarArraySum {
    public static void main(String[] args){
        //  Question 2

        //This is the program to add elements of 2 variable sized array and insert it into 3rd array

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of first array - ");
        int size1 = sc.nextInt();

        double[] array1 = new double[size1];
        System.out.println( "Enter the elements of array 1 ");
        for(int i = 0; i < size1; i++){
            array1[i] = sc.nextDouble();
        }

        System.out.print("Enter the size of Second array - ");
        int size2 = sc.nextInt();
        double[] array2 = new double[size2];
        System.out.println( "Enter the elements of array 2 ");
        for(int i = 0; i < size2; i++){
            array2[i] = sc.nextDouble();
        }
        int size3 = 0;
        boolean flag = true;
        if( size1 > size2 ){
             size3 = size1;
             flag = true;
        }
        else{ 
            size3 = size2;
            flag = false;
        }
        double[] array3 = new double[size3];
         int count = 0;
        for (int i = 0; i< size3; i++){

            if(flag){
                if( count < size2 ){
                   array3[i] = array1[i] + array2[i];
                   count++; 
                }
                else{
                    array3[i] = array1[i];
                }
            }
            else{
                if( count < size1 ){
                    array3[i] = array1[i] + array2[i];
                    count++; 
                 }
                 else{
                     array3[i] = array2[i];
                 }
            }
            }
            System.out.println("1st Array = " +Arrays.toString(array1) + " 2nd Array = " +Arrays.toString(array2));
            System.out.println("3rd Array or  The Sum array = " +Arrays.toString(array3));
            sc.close();
        }
    }