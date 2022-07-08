public class Splitname {

    public static void main(String args[]){
        String[] arr = split("Hello i am Anuj", ' ');
        for(int i = 0; i< arr.length;i++)
        System.out.println(arr[i]);
    }
    
static String[] split(String s, char Separator){
    int count = 1;
    for(int i =0; i< s.length(); i++){

        if( s.charAt(i) == Separator){
            count += 1;
        }
    }
    String[] arr = new String[count];
    count = 0;
    String str = "";
    for(int i =0; i< s.length(); i++){

        if( s.charAt(i) == Separator || i == s.length()-1){
            if(i == s.length()-1){
                str += s.charAt(i);
            }
            arr[count] = str;
            str = "";
            count +=1;
        }
        else{
            str = str + s.charAt(i);
        }
    }
    return arr;
}
}
