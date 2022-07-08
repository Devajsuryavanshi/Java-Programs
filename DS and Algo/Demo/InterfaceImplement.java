package Demo;
import java.util.*;

public class InterfaceImplement implements InterfaceOperations {
    
    public float division(float a, float b){
        return (a/b);
    }


    public float multipication(float a, float b){
        return (a*b);
    }


    public void countletters(String S){
        int counter = 1;
        ArrayList<Integer> count = new ArrayList<Integer>();
        int len = S.length();
        int n =0;
        while(n < len){
           char ch = S.charAt(n);
           for(int i = n+1; i< len; i++){
               //Below code will remove the duplicate letters encountered.
               if(S.charAt(i) == ch || S.charAt(i) == ' '){
                   if(S.charAt(i) != ' ')
                      counter += 1;
                    S = S.substring(0,i) + S.substring(i+1);
                    len = S.length();
                    i -= 1;
               }
           }
           count.add(counter);
           counter = 1;
           n += 1;
        }
        for(int i = 0; i< S.length(); i++)
        System.out.println(S.charAt(i) + "- " + count.get(i));
        
    }

    public String lowerUpper(String S){
        String str = "";
        for(int i = 0; i < S.length(); i++){
            if( Character.isUpperCase(S.charAt(i))){
                str += Character.toLowerCase(S.charAt(i));
            }
            else if( Character.isLowerCase(S.charAt(i)))
                str += Character.toUpperCase(S.charAt(i));
            else 
                str += S.charAt(i);
        }
        return str;
    }
}
