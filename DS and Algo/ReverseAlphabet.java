public class ReverseAlphabet {

    public static void main(String args[]){

        System.out.println(reverseString("1 cup of hot coffee costs 8.00, whereas cold coffee costs 45.00."));


    }

    static String reverseString(String S){

        int len = S.length();
        String str = "";
        String rev = "";
        for(int i = 0; i<len ; i++){
            if((S.charAt(i) >= 'A' && S.charAt(i) <= 'Z') || (S.charAt(i) >= 'a' && S.charAt(i) <= 'z') )
                str = str + S.charAt(i);
            else{
                str = reverse(str);
                rev += str + S.charAt(i);
                str = "";
                }
            }
            return rev;
        }

        static String reverse(String s){
            String str = "";
            for( int i = s.length()-1; i>=0; i--){
                str += s.charAt(i);
            }
            return str;
        }
    }
    
