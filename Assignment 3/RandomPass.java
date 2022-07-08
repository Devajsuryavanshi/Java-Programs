public class RandomPass {
    
    public static void main(String[] args){

        System.out.println("Enter your First name");
        String firstname = System.console().readLine();

        System.out.println("Enter second name");
        String secondname = System.console().readLine();
        
        System.out.println("Enter your date of birth");
        String dob = System.console().readLine();

        System.out.println("Your age");
        String age = System.console().readLine();

        System.out.println("Your id");
        String id = System.console().readLine();

        String characters = firstname + secondname + dob + age + id;
        String password = "";
        int len = characters.length();

        for(int i = 0; i < 8; i++){

            password += characters.charAt((int)(Math.random()*len));
        }
        System.out.println("New Pass - "+password);
    }
}
