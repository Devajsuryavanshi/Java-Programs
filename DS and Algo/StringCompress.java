public class StringCompress{

    public static void main(String args[]){

        String s = System.console().readLine();

        String str = Compress(s.toLowerCase());
        if(str.length() < s.length())
        System.out.println("Compressed String - "+str);
        else 
        System.out.println("This string can't be compressed - " +s);
        
    }

    static String Compress(String s){
        int len = s.length();
        int n = 0;
        int count = 1;
        String str = "";
            for(int i = n+1; i<len;i++){
                if(s.charAt(n) == s.charAt(i)){
                    count += 1;
                    if(i == len - 1){
                        str = str + s.charAt(n) + count;
                    }
                }
                else{
                    str = str + s.charAt(n) + count;
                    count = 1;
                    n = i;
                    if(i == len-1){
                        str += s.charAt(n) + count;
                    }
                }
            }
        return str;
    }
}