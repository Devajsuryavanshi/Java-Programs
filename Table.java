import java.util.*;
public class Table {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want the table for - ");
        int num = sc.nextInt();
        System.out.println();
        for( int i = 1; i<=12; i++ ){
            System.out.print(num +"x" +i +"=" +(i*num));
            System.out.println();
        }
        sc.close();
    }
}
