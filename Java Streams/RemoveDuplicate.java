import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    
    static List<String> names = Arrays.asList("Amit", "Devaj", "Satyam", "Vaibhav", "Amit");
    public static void main(String[] args) {
        
        Set<String> namesSet = names.stream().collect(Collectors.toSet());

        System.out.println(namesSet);
    }
}
