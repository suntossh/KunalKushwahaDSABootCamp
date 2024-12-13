package recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        int sum = productOfAllDigits(1230);
        System.out.println(sum);
    }

    public static int productOfAllDigits(int n) {
        if (n%10 == n) {
            return n;
        }
        return n % 10 * productOfAllDigits(n / 10);
    }
}
