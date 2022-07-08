import java.util.Arrays;
public class ArraySum {
    public static void main(String[] args){
        //Question 1
        // THIS PROGRAM GENERATES A RANDOM ARRAY OF SIZE 0-10 AND PRINT THE SUM OF IT'S ELEMENTS.

        int size = (int)(Math.random()*10);
        System.out.println(size);

        int[] a = new int[size]; 
        int sum = 0;

        for( int i = 0; i< a.length; i++ ){

            a[i] = (int)(Math.random() * 100);
            sum += a[i];

        }
        System.out.println("Random Array = " +(Arrays.toString(a)) +" and It's sum = " +sum  );
    }
}