package recursion;

public class ReverseWay2 {


    public static void main(String[] args) {
        // n= 1234

        System.out.println(rev02(1234));
    }

    private static int rev02(int n) {
        int digits = (int) Math.log10(n);

        return helper(n, digits);

    }

    private static int helper(int n, int digits) {

        if (n % 10 == n) {
            return n;
        }
        int reversed = (n % 10 * (int) Math.pow(10, digits))
                +
                helper(n / 10, --digits);
        return reversed;

    }
}
