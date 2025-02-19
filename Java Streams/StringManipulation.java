import java.util.*;
import java.util.stream.Collectors;
public class StringManipulation {
    
    static List<String> names = Arrays.asList("Amit", "Devaj", "Satyam", "Vaibhav", "Aditya");

    public static void main(String[] args) {
        List<String> toUpperCase = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(toUpperCase);

        List<String> sortedString = names.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());

        System.out.println(sortedString);

        //Sort each name alphabetically and then compare and print the sorted names
        List sortedNames = names.stream().map(s -> sortAlphabetically(s)).sorted((s1,s2) -> s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println(sortedNames);
    }

    public static String sortAlphabetically(String s){
        char[] name = s.toCharArray();
        Arrays.sort(name);
        return new String(name);
    }
}
