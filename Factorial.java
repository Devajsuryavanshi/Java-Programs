import java.util.*;
public class Factorial {
    public static void main(String args[]){
      System.out.print("Enter a positive number to find it's factorial - ");
      Scanner s = new Scanner(System.in);
      int a = s.nextInt();
      if( a >= 0 && a<=2  ){
      System.out.println("Factorial = " +a);
      }
      else if( a>2 ){
        double fact  = 1;
        for(int i = 2; i <= a; i++){
            fact *= i;
        }
     System.out.println("Factorial = " +fact);
      }
      else{
          System.out.println("Enter valid input");
          }
          s.close();
      }
    }