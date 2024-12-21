package recursion.pattern;

import java.util.Arrays;

public class QuickSortInPlace {

    // what is it Doing?
    // take a pivot of your choice and ensure values in arr less than pivot is to left
    // values in arr more then pivot is in right of it.
    // basically we put the pivot in correct place.


    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int hi) {

        if (low >= hi) {
            return;
        }
        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = arr[m];

        while (s <= e) {

            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
            System.out.println(Arrays.toString(arr));
        }

        // low is easy to understand, it tell the start index,
        // end index is e because after external while loop above is completed,
        // the pivot is swapped to its correct position *******
        // during that pointer s moved to right
        // pointer e moved to left
        // looking like
        // from low s e hi  --> low e s hi

        sort(arr, low, e);
        sort(arr, s, hi);
    }


}
