import java.util.*;
public class Average {
    
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,8,22,44,61,21,44,121,5321,22,0);
        OptionalDouble average = numbers.stream().mapToInt(n -> n).average();
        System.out.println(average.getAsDouble());

        int sumOfEven = numbers.stream().filter(n -> n%2 == 0).mapToInt(n -> n).sum();

        System.out.println(sumOfEven);

        OptionalInt minimum = numbers.stream().mapToInt(Integer::intValue).min();

        System.out.println("Minimum = "+minimum.getAsInt());

        /** My first Approach at finding second smallest 
        List<Integer> sortedNums  = numbers.stream().sorted().collect(Collectors.toList());

        System.out.println("Second Smallest - " +sortedNums.get(1)); */

        //Actual Ideal Approach
        OptionalInt secondSmallest = numbers.stream().sorted().mapToInt(n -> n).skip(1).findFirst();

        System.out.println("Second Smallest = "+secondSmallest.getAsInt());
    }
}