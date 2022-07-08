import java.util.*;

public class test1 {
        static int unchanged(int N, int A[]) {
            //this is default OUTPUT. You can change it
            int result=0;
            final int[] arr1 = A;
            System.out.println("Original array -"+ Arrays.toString(A));
            A = sorter(A);
            for(int i = 0; i < N; i++){
                if(arr1[i] == A[i]){
                result += 1;
                }
            }
            System.out.println(Arrays.toString(arr1) + " " +Arrays.toString(A));
            
            return result;
        }
        static int[] sorter(int arr[]){
            for(int i =0; i< arr.length; i++){
                for(int j = 0; j<arr.length-1-i; j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            return arr;
        }
        public static void main(String[] args) {
            // INPUT [uncomment & modify if required]
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            
            int A [] = new int[N];
            for(int i=0; i<N; i++) {
                A[i] = sc.nextInt();
            }
            
            // OUTPUT [uncomment & modify if required]
            System.out.print(unchanged(N,A));
            sc.close();
        }
}