package Demo;

public class Operations {
    public static void main(String args[]){
        InterfaceImplement obj= new InterfaceImplement();
        System.out.println("Enter the choice, 1 for division, 2 for multiplication, 3 for letter count and 4 for lower upper conversion");
        int choice = Integer.parseInt(System.console().readLine());
        if(choice == 1){
        System.out.println(obj.division(22, 5));}
        else if(choice == 2)
        System.out.println(obj.multipication(5,5));
        else if(choice == 3)
        obj.countletters("Hello world".toUpperCase());
        else if(choice == 4){
            System.out.println("Enter the String");
        System.out.println(obj.lowerUpper(System.console().readLine()));}
        else
            System.out.println("Enter correct choice");
    }
}
