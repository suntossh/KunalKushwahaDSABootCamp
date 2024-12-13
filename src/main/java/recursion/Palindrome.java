package recursion;

public class Palindrome {
    public static void main(String[] args) {
        // A number is a Palindrome if its reverse is same as its original value
        System.out.println(isPalindrome(123321));

    }

    static boolean isPalindrome(int n) {
        return (n == rev2(n));
    }

    private static int rev2(int n) {
        int digits = (int) Math.log10(n);

        return helper(n, digits);

    }

    private static int helper(int n, int digits) {

        if (n % 10 == n) {
            return n;
        }

        return n % 10 * (int) Math.pow(10, digits) + helper(n / 10, --digits);

    }

}
