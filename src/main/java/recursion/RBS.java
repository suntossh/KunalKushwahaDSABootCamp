package recursion;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3, 4};
        //int[] arr = {1,2,3,4,5, 6, 7, 8, 9};  // FUN FACT, Code for RBS works for BS also.

        System.out.println(search(arr, 9, 0, arr.length - 1));
    }

    private static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        //{5, 6, 7, 8, 9, 1, 2, 3, 4} target = 7
        int m = s + (e - s) / 2;
        System.out.println("Middle Index of Start:" + s + " & End:" + e + " =" + m);
        if (arr[m] == target) {
            return m;
        }

        // In Rotated Binary Search we dont know where the mid will come,
        // either in the Sorted Side or Mixed(unsorted side)

        // First think of this eg //{5, 6, 7, 8, 9, 1, 2, 3, 4} and target = 7

        // so left of mid is Sorted (.i.e  5, 6, 7, 8, 9 ) and then basically see target is where in the left part
        // if target is between left side then end = mid -1
        // else start = mid +1

        if (arr[s] < arr[m]) {
// SORTED PART i.e. S and M
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m - 1);
            } else {
                return search(arr, target, m + 1, e);
            }
        } else {
// NON SORTED PART  ie M and E
            // {6, 1, 2, 3, 4}  t=3, m= 2
            // if you think of above input then target will come in not sorted part (i.e. 6, 1, 2)
            // so accordingly we put checks around
            if (target >= arr[m] && target <= arr[e]) {
                return search(arr, target, m + 1, e);
            } else {
                return search(arr, target, s, m - 1);
            }
        }
    }
}