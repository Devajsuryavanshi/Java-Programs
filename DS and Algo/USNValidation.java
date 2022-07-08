import java.lang.Character;
import java.util.Arrays;
public class USNValidation {

    public static void main(String args[]){
        
        System.out.println("Enter the USN ");
        String USN = System.console().readLine();
        if(TestUSN(USN))
        System.out.println("Valid USN");
        else
        System.out.println("Invalid USN");
    }

    static boolean onlydigit(String a){

        for(int i = 0; i< a.length(); i++){
            if(a.charAt(i) >= '0' && a.charAt(i) <= '9' )
                continue;
            else
                return false;
        }
        return true;
    }

    static boolean TestUSN(String USN){
        if (USN.length() == 10){

            if(USN.charAt(0) == '1' || USN.charAt(0) == '0'){

                 if(Character.isUpperCase(USN.charAt(1)) && Character.isUpperCase(USN.charAt(2))){

                     if(Character.isDigit(USN.charAt(3)) && Character.isDigit(USN.charAt(4))){

                         String sub = USN.substring(5, 7);
                         String[] s = {"CS", "IS", "EC", "ME"};

                         if(Arrays.asList(s).contains(sub)){

                            if(onlydigit(USN.substring(7,10)))
                                return true;
                            else return false;
                         } else return false;
                     } else return false;
                 }
                 else return false;
            }
            else return false;
        }
        else
        return false;
    }
    
}
