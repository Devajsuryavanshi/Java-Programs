
import java.util.*;
public class Hailstone {
    public static void main(String args[]){


        System.out.print("Enter a positive number to get hailstone sequence- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if( n <= 0)
        System.out.println("Enter a valid input");
        else{
            int count = 0;
            while ( n != 1 ){
                if (n%2 == 0){
                    System.out.println(n + " is even, so i take half: " +(n/2));
                    n /= 2;
                    count++;  
                }
                else{
                    System.out.println(n + " is odd so i make it 3n+1: " +(3*n+1));
                    n = (3*n) + 1;
                    count++;
                }
            }
            System.out.println("It took " +count +" steps to reach 1");
        }
        sc.close();

}
}
