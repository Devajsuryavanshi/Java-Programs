
public class SubSequence {

    static Integer[] arr = {1,7,3,5,10,-3,-1,22,143,144,155,166,23,41,42};
    static Integer[] arr1 = {1,3,5,4};
    
    public static void main(String[] args) {
        System.out.println("Increasing Sub Sequence count = "+increasingSubSeq(arr1, 0,Integer.MIN_VALUE) + " or "+countIncreasingSubSeq(arr1, 0, Integer.MIN_VALUE));
    }

    static int increasingSubSeq(Integer arr[], int current, int prev){
        
        if(current == arr.length)
          return 1;
        
        int exclude = increasingSubSeq(arr, current+1, prev);

        int include = 0;
        if(arr[current] > prev){
            include = increasingSubSeq(arr, current+1, arr[current]);
        }

        return include + exclude;
        
    }

    public static int countIncreasingSubSeq(Integer[] arr, int start, int prev) {
        // Base case: if we've processed all elements
        if (start == arr.length) {
            return 1; // Every ending point is a valid subsequence
        }

        // Recursive case: explore both including and excluding the current element
        int exclude = countIncreasingSubSeq(arr, start + 1, prev);

        int include = 0;
        if (arr[start] > prev) {
            include = countIncreasingSubSeq(arr, start + 1, arr[start]);
        }

        // Total count is the sum of both choices
        return exclude + include;
    }
}
