public class Lastname {
    public static void main(String[] args){
        System.out.println("Enter the 1st full name");
        String name1 = System.console().readLine();
        System.out.println("Enter the second guy's name ");
        String name2 = System.console().readLine();

        String[] firstsplit = name1.split(" ");
        String[] secondsplit = name2.split(" ");

        name1 = firstsplit[0] +" "+ secondsplit[1];
        name2 = secondsplit[0] +" "+ firstsplit[1];

        System.out.println("New first guy's name - "+name1 + ", Second guys new name - " +name2);
    }
}
