public class Power {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1; // Base case
        } else {
            return x * power(x, n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        int base = 12;
        int exponent = 4;
        System.out.println(base + " raised to the power of " + exponent + " is " + power(base, exponent));
    }
}