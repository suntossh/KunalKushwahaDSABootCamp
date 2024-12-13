package recursion;

public class Fibo {
    public static void main(String[] args) {
        System.out.println("Hari Bol Fibo using recursion");
        int value = fib(4);
        System.out.println(value);
    }

//    0 1 2 3 4  5  6   7    8     9     10
//    0 1 1 2 3  5  8  13    21    34    55

//recurrence relation is : fib(n) =  fib(n-1) + fib(n-2)

//                       F(4)
//                    F(3) + F(2)
//                F(2)+F(1)    F(1)+F(0)
//             F(1)+F(0)
//
    private static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1)
                +
                fib(n - 2);
    }
}
