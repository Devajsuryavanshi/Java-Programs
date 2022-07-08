
//Question 9 of the Assignment 2

import java.util.*;
public class UniqueArray {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array = ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the elements of array 1");

        for ( int i = 0; i < size1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of Second array = ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter the elements of array 2");

        for ( int i = 0; i < size2; i++){
            arr2[i] = sc.nextInt();
        }

        ArrayList<Integer> unique= new ArrayList<Integer>();

        // Checking Array1 Elements

        int count = 0;
        for (int i = 0; i<size1; i++){
            int ele = arr1[i];
            for(int j = 0; j<size2; j++){
                if( ele == arr2[j] ){

                    count = 1;
                    break;
            }
        }
        if(count == 0)
        unique.add(ele);
        count = 0;
    }

    //Checking Array2 Elements

    for (int i = 0; i<size2; i++){
        int ele = arr2[i];
        for(int j = 0; j<size1; j++){
            if( ele == arr1[j] ){

                count = 1;
                break;
        }
    }
    if(count == 0)
    unique.add(ele);
    count = 0;
}
sc.close();
System.out.println("Your inputed arrays are - "+Arrays.toString(arr1) +" and "+Arrays.toString(arr2));
System.out.println("Unique array = "+Arrays.toString(unique.toArray()));
}
}