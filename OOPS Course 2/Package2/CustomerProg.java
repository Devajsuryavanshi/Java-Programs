package Package2;
import java.util.*;

public class CustomerProg {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Customer[] arr = new Customer[2];

        for(int i =0; i < 2; i++){
        arr[i] = new Customer();
        System.out.println("Enter" +i+1+" Customer details ");
        System.out.println("id ");
        arr[i].setId(sc.nextLong());
        System.out.println("Name ");
        arr[i].setName(sc.next());
        System.out.println("Gender");
        arr[i].setGender(sc.next().charAt(0));
        System.out.println("Email ");
        arr[i].setEmail(sc.next());
        System.out.println("Contact number -");
        arr[i].setContactNumber(sc.next());
        }

        if(arr.equals(arr))
        System.out.print("both are same");
        else
        System.out.print("Both are different");

        sc.close();
    }
}