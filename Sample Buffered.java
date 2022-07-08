import java.io.*;
class Hello{  
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the First Number - ");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter the Second Number - ");
        int b = Integer.parseInt(br.readLine());
        int c = a + b;
        System.out.println("addtion = " +c);
    }
}  