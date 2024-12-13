package recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int sum = sumOfAllDigits(103);
        System.out.println(sum);
    }

    public static int sumOfAllDigits(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sumOfAllDigits(n / 10);
    }
}
