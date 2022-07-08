import java.util.*;
class HW{

    public static final Scanner sc = new Scanner(System.in);

    int[] fibonacci(int n){

        int[] arr = new int[n];
        arr[0] = 0; arr[1] = 1;

        for(int i = 2; i < n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr;
    }

    int[] evenOdd(int[] arr){

        for(int i =0; i< arr.length; i++){
            if(arr[i] % 2 == 0)
            continue;
            for(int j = i+1; j< arr.length; j++){
                if(arr[j]%2 == 0){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    

    public static void main(String[] args){

        HW obj = new HW();

        System.out.println("Press 1 for fibbonacci and 2 for even odd");
        int choice = sc.nextInt();

        if( choice == 1){
            System.out.println("Please enter how many fibonacci number series you want");
            int n = sc.nextInt();
            int[] arr = obj.fibonacci(n);
            for( int i = 0; i<n; i++)
            System.out.print(arr[i] + " ");
        }
        else if( choice == 2 ){
            System.out.println("Enter the size of array");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter the elements of array");
            for(int i = 0; i< n; i++)
            arr[i] = sc.nextInt();

            arr = obj.evenOdd(arr);

            System.out.println("Even first odd after array -");
            for(int i = 0; i< n; i++)
            System.out.print(arr[i]+" ");
        }
        else
        System.out.println("Enter the correct choice");

    }
}