import java.lang.Character;
public class NameInitials {

    public static void main(String args[]){
        
        System.out.println("Enter your full name ");
        String s = System.console().readLine();
        if(s == ""){
            System.out.println("Invalid input");
        }
        else{
        String initial = ""+s.charAt(0);
        
        for(int i = 1; i< s.length(); i++){
            if(s.charAt(i) == ' ' && i< s.length()-1 && s.charAt(i+1) != ' ')
            initial += s.charAt(i+1);
            if(Character.isUpperCase(s.charAt(i)) && s.charAt(i-1) !=  ' ')
            initial += s.charAt(i);
        }

        System.out.print(initial.toUpperCase());
    }

    }
    
}
