import java.util.Scanner;

public class StringArrSort{


    static String[] bubbleSort(String[] arr){

        for(int i=0; i < arr.length; i++){
            for(int j = 0; j< arr.length-1-i; j++){

                if(arr[j].compareTo(arr[j+1]) > 0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    static String[] insertionSort(String[] arr){

        for(int i = 1; i < arr.length; i++){

            String temp = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j].compareTo(temp) > 0){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=temp;
        }

        return arr;
    }

    static String[] SelectionSort(String[] arr){

        int len = arr.length;
        for(int i =0; i<len; i++){
            int min = i;
            for(int j = i+1; j< len; j++){
                if(arr[min].compareTo(arr[j]) > 0)
                    min = j;
            }
            String temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static void main(String[] arr){

        System.out.println("Enter the array size ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        System.out.println("Enter the elements of the array");

        for(int i = 0; i < n; i++){
            s[i] = System.console().readLine();
        }

        System.out.println("Enter 1 for bubble sort and 2 for insertion sort 3 for selection ");
        int choice = sc.nextInt();
        if(choice == 1){
            s = bubbleSort(s);
        }
        else if( choice == 2)
            s = insertionSort(s);
        else if( choice == 3 )
            s = SelectionSort(s);
        else
            System.out.println("Enter the correct choice");

        for(int i = 0; i<s.length; i++){
            System.out.print(s[i]+ " ");
        }

        sc.close();
    }
}