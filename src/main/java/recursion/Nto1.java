package recursion;

public class Nto1 {
    public static void main(String[] args) {

        //for n=5 print 5, 4, 3, 2, 1
        //printForward(5);
        //for n=5 print 1, 2, 3, 4, 5
        //printBackwards(5);
        //for n=5 print 5, 4, 3, 2, 1 and then 1, 2, 3, 4, 5
        printForwardAndBackwards(5);
    }

    public static void printForward(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        printForward(n - 1);
    }

    public static void printBackwards(int n) {
        if (n < 1) {
            return;
        }
        printBackwards(n - 1);
        System.out.println(n);
    }

    public static void printForwardAndBackwards(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        printForwardAndBackwards(n - 1);
        System.out.println(n);
    }



}
