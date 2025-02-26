
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayListOp {
    
    private final List<Integer> numbers = new ArrayList<>(Arrays.asList(1,5,4,3,22,0,0,0,55,21,44,65,11,11,4,1991));
    public static void main(String[] args) throws IOException{

        ArrayListOp obj = new ArrayListOp();
        
        /* Reverse */

        System.out.println(reverse(obj.numbers));
        System.out.println(RemoveDuplicate(obj.numbers));

        System.out.println(moveZeroesToEnd(obj.numbers));
    }

    static List<Integer> reverse(List<Integer> nums){

        /* Naive Approach 
        List<Integer> reversed = new ArrayList<>();
        for(int i = nums.size()-1; i >= 0; i--){
            reversed.add(nums.get(i));
        }
        return reversed; */

        /* Pro Approach */

        int left = 0, right = nums.size()-1;

        while(left < right){
            int temp = nums.get(left);
            nums.set(left, nums.get(right));
            nums.set(right,temp);
            left++;
            right--;
        }
        return nums;
    }

    public static Set<Integer> RemoveDuplicate(List<Integer> arr){
        return arr.stream().collect(Collectors.toSet());
    }

    /* Other Approaches for Duplicate
     * Naive
        public static ArrayList<String> removeDuplicates(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();
        for (String item : list) {
            if (!result.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }
        Best 
        public static ArrayList<String> removeDuplicates(ArrayList<String> list) {
        HashSet<String> seen = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();
        for (String item : list) {
            if (seen.add(item)) {
                result.add(item);
            }
        }
        return result;
    }
     */

     public static ArrayList<Integer> findIntersection(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> intersection = new HashSet<>();

        for (Integer num : list2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        return new ArrayList<>(intersection);
    }

    /* My Approach or Naive Approach */
    public static List<Integer> moveZeroesToEnd(List<Integer> list) {
        
        int i=0,count=0;
        while(i < list.size()){
            if(list.get(i) == 0){
                list.remove(i);
                count++;
                continue;
            }
            i++;
        }
        for(int k = 0; k < count; k++){
            list.add(0);
        }
        return list;
    }

    /* Best way to do the same 
    public static List<Integer> moveZeroesToEnd(List<Integer> list) {
        int nonZeroIndex = 0;

        // Move non-zero elements to the front of the list
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0) {
                list.set(nonZeroIndex++, list.get(i));
            }
        }

        // Fill the remaining elements with zeroes
        for (int i = nonZeroIndex; i < list.size(); i++) {
            list.set(i, 0);
        }

        return list;
    }
     */
}
