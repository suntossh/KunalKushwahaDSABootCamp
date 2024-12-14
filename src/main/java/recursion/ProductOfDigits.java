package recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        int sum = productOfAllDigits(1232);
        System.out.println(sum);
    }

    public static int productOfAllDigits(int n) {
        if (n%10 == n) {
            return n;
        }
        return n % 10 * productOfAllDigits(n / 10);
    }
}

// 1232
// 2* method(123)->{3 * method(12)->{2 * method(1)->{return 1}}}