package recursion;

public class Factorial {

    public static void main(String[] args) {
        // Factorial of 5 = 5*4*3*2*1
        // which means 5!=  5* 4!

        int factorial = fact(6);
        System.out.println(factorial);


    }

    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }


}
