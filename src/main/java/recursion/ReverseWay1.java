package recursion;

public class ReverseWay1 {


    static int sum = 0;

    static void rev01(int n) {

        if (n == 0) {
            return;
        }

        int rem = n % 10;

        sum = (sum * 10) + rem;

        rev01(n / 10);
    }

    public static void main(String[] args) {
        // n= 1234
        // output should take % of n then add to sum then Run in recursive loop to
        // get the last digit by using % and then add it to sum*10.
        rev01(1234);
        System.out.println(sum);
    }
}
