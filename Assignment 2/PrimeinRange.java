
// Question 7 of the assignment 2
import java.util.*;
public class PrimeinRange {
    static boolean IsPrime(long n){
        if( n < 2){
            return false;
        }
        else{
            for(int i = 2; i<= Math.sqrt(n); i++){
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args){

        System.out.println("Please Enter the Lower Range" );
        Scanner sc = new Scanner(System.in);
        int LR = sc.nextInt();
        System.out.println("Please Enter upper Range");
        int UR = sc.nextInt();
        if(LR>UR){
            System.out.println("Please enter correct range");
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = LR; i < UR; i++ ){
            if(IsPrime(i))
            arr.add(i);
        }
        System.out.println("Prime in range = "+ Arrays.toString(arr.toArray()));
        sc.close();
    }

}
