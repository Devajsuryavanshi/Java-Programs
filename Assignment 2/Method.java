
// Question 3 of the Assigment

import java.io.*;
public class Method {
    static void name(String n){
        System.out.println("Hello! "+n);
    }
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What's Your name buddy? ");
        String na = br.readLine();
        name(na);
        
    }
}
