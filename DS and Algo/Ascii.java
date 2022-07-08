public class Ascii {
    
    static int getascii(char ch){
        return (int)ch;
    }

    public static void main(String args[]){

        System.out.println("Enter the Word");
        String S = System.console().readLine();
        for(int i = 0; i< S.length(); i++){
            System.out.println("Ascii value of "+S.charAt(i) +" is "+ getascii(S.charAt(i)));
        }
    }
}
