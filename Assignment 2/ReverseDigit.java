
//Question number 5

import java.util.Scanner;
public class ReverseDigit {
    public static void main(String[] args){
        System.out.print("Enter the Number to be reversed - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int rem = 0;
        while(n > 0){

            rem = n % 10;
            rev = (rev*10)+rem;
            n = n/10;
        }
        System.out.println("Reverse = "+rev);
        sc.close();
    }
}
