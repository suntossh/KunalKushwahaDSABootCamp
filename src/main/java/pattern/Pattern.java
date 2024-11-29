package pattern;

public class Pattern {
    public static void main(String[] args) {
        //pattern3(5);
        //pattern4(5);
        //pattern5(6);
        //pattern30(5);
        pattern17(5);
    }


    //        * * * * *
    //        * * * *
    //        * * *
    //        * *
    //        *
    public static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
//n=5
//row=2n-1
//        *                          r=1
//        * *                        r=2
//        * * *                      r=3
//        * * * *                    r=4
//        * * * * *                  r=5
//        * * * *                    r=6
//        * * *                      r=7
//        * *                        r=8
//        *                          r=9


    public static void pattern5(int n) {

        for (int row = 1; row <= (2 * n) - 1; row++) {

            int totalColsForEachRow = (row <= n) ? row : (2 * n) - row;
//            if (row <= n) {
//                totalColsForEachRow = row;
//            } else {
//                totalColsForEachRow = (2 * n) - row;
//            }

            for (int col = 1; col <= totalColsForEachRow; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }


//n=5
//             1                          r=1
//           2 1 2                        r=2
//         3 2 1 2 3                      r=3
//       4 3 2 1 2 3 4                    r=4
//     5 4 3 2 1 2 3 4 5                  r=5

// from row number till 1 and 2 till row number**
    public static void pattern30(int n) {

        for (int row = 1; row <= n; row++) {
            // Fill each line with Space first
            int noOfSpaces = n - row;
            for (int s = 1; s <= noOfSpaces; s++) {
                System.out.print("  ");
            }
            // then fill col to 1, using row as start, in same line
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            // then fill from 2 to row , using row as end, in same line
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println(" ");
        }
    }

//n=5
// r= 2n-1
//             1                          r=1
//           2 1 2                        r=2
//         3 2 1 2 3                      r=3
//       4 3 2 1 2 3 4                    r=4
//     5 4 3 2 1 2 3 4 5                  r=5
//       4 3 2 1 2 3 4                    r=6
//         3 2 1 2 3                      r=7
//           2 1 2                        r=8
//             1                          r=9

    // from row number till 1 and 2 till row number**
    public static void pattern17(int n) {

        for (int row = 1; row <= 2*n-1; row++) {
            // Fill each line with Space first
            //int noOfSpaces = n - row;
            int noOfSpaces = (row <= n) ? n - row : row - n;

            for (int s = 1; s <= noOfSpaces; s++) {
                System.out.print("  ");
            }
            // then fill col to 1, using row as start, in same line
            int frontRow = (row <= n) ? row : 2*n - row;

            for (int col = frontRow; col >= 1; col--) {
                System.out.print(col + " ");
            }
            // then fill from 2 to row , using row as end, in same line
            for (int col = 2; col <= frontRow; col++) {
                System.out.print(col + " ");
            }
            System.out.println(" ");
        }
    }

    //        1
    //        1 2
    //        1 2 3
    //        1 2 3 4
    //        1 2 3 4 5
    public static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }
    }

}
