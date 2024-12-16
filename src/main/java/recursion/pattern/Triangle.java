package recursion.pattern;

public class Triangle {


    public static void main(String[] args) {
        //triangleUpSideDown(4, 0);
        System.out.println("##############");
        triangleNormal(3, 0);
    }

    // Logic is : print one * at a time in each method call
    // take a row and col var
    // now print one full row, start with r=4 and c=0 and then keep as long as c<r else print \n
    // and reduce the row count and reset col to 0 so now it will start with  3, 0 ....

    //    * * * * *
    //    * * * *
    //    * * *
    //    * *
    //    *
    static void triangleUpSideDown(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("* ");
            triangleUpSideDown(r, c + 1);
        } else {
            System.out.println();
            triangleUpSideDown(r - 1, 0);
        }
    }

    // Logic is : print one * at a time in each method call, catch is understand triangleUpSideDown
    // and then simply delay the printing by keeping sout after method call returns.
    //
    // Basically understand that if we keep sout after a method call then current method execution is kept
    // in waiting state in the call stack and it waits for the called method to return before it prints its sout.


    //    *
    //    * *
    //    * * *

    static void triangleNormal(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangleNormal(r, c + 1);
            System.out.print("* ");
        } else {
            triangleNormal(r - 1, 0);
            System.out.println();
        }
    }

}
