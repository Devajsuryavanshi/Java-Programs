import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;

class Keypress {
    public static int minimumKeypresses(int N,int K,String S1,String S2) {
        //this is default OUTPUT. You can change it.
        int result=-404;
        
        //write your Logic here:
        int left = 0;
        int right = S2.length();
        int i = 0;
        int count = 0;
        S1.toLowerCase(); 
        S2.toLowerCase();
        int a[] = new int[S2.length()];
        for(int j = 0; j< S2.length(); j++){
            int ch1 = S2.charAt(i); int ch2 = S1.charAt(i);
            if(S2.charAt(j) > S1.charAt(j)){
                a[j] =ch1 - ch2;
            }
            else
                a[j] = -1 * (ch1- ch2);
        }
        Arrays.sort(a);
        if( S1.length() == S2.length() && S1.length() > 0 && K <= 100){
            while(i > S1.length()){
                char ch = S1.charAt(i);
                char ch1 = S2.charAt(i);
                if(ch == ch1){
                    continue;
                }
                if(ch < ch1){
                    int l = ch1 - ch;
                    int sp =0;
                    for(int iter = 0; iter< a.length; iter++){
                        if(a[iter] == l){
                            sp = iter;
                        }
                    }
                    if(sp <= K){
                        K++;
                        count++; //use specialkey funct
                    }
                    else{
                        count += l; //normal conversion
                    }
                }
                if(ch > ch1){
                    int l = ch - ch1;
                    int sp =0;
                    for(int iter = 0; iter< a.length; iter++){
                        if(a[iter] == l){
                            sp = iter;
                        }
                    }
                    if(sp <= K){
                        count++; //use specialkey funct
                    }
                    else{
                        count += l; //normal conversion
                    }
                }

            }
            return count;
        }
        
        
        return result;
        
    }

    static char UpArrow(char ch){
        if(ch == 'a') return 'z';
        else return --ch;
    }
    static char downArrow(char ch){
        if(ch == 'z') return 'a';
        else return ++ch;
    }
    static int LeftArrowkey(int i, String S){
        if(i == 0) return S.length()-1;
        else return --i;
    }
    static int RightArrowkey(int i, String S){
        if( i == S.length() - 1) return 0;
        else return ++i;
    }
    static String SpecialKey(String S, char ch,int i){
        char[] str = S.toCharArray();
        str[i] = ch;
        S = Arrays.toString(str);
        return S;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //INPUT [uncomment & modify if required]   
        int N,K;
        N = sc.nextInt();
        K = sc.nextInt();
        String S1 = sc.next();
        String S2 = sc.next();
        sc.close();
        
        //OUTPUT [uncomment & modify if required]
        System.out.println(minimumKeypresses(N,K,S1,S2));
        
    }

}