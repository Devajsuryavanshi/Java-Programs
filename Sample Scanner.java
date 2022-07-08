import java.util.*;
class Sample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number = ");
        int a = sc.nextInt();
        System.out.println("Enter the second number = ");
        double b = sc.nextDouble();
        double c = a*b;
        double d = a/b;
        System.out.println("Multiplicaton = " +c);
        System.out.println("Division = " +d);
        sc.close();
        }
}