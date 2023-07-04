package binaysearch;

import java.util.Arrays;

public class FindInMountain {

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 4, 3, 2, 1};
        int peak = findPeakPosition(array);
        System.out.println("Peak In Mountain is " + array[peak]);
        System.out.println(binarySearchIndex(array, 4, 0, peak));
        System.out.println(binarySearchIndex(array, 4, 0, peak));
        System.out.println(binarySearchIndex(array, 1, peak + 1, array.length - 1));
    }

    static int findPeakPosition(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            System.out.println("Start=" + start + " End = " + end + " total in between " + (end - start) + " elements");
            int middle = start + ((end - start) / 2);
            if (array[middle] > array[middle + 1]) { //
                end = middle;
            } else /*if (array[middle] < array[middle + 1])*/ {
                start = middle + 1;
            }
        }
        return start;
    }

    public static int binarySearchIndex(int[] arr, int target, int start, int end) {
//        int start = 0;
//        int end = arr.length - 1;

        boolean isAsc = arr[0] < arr[arr.length - 1];
        System.out.println(Arrays.toString(arr) + " Array isAsc " + isAsc);


        while (start <= end) {

            int midIndex = start + ((end - start) / 2);


            if (isAsc) {
                if (target < arr[midIndex]) {
                    end = midIndex - 1;
                } else {
                    start = midIndex + 1;
                }
            } else {
                if (target > arr[midIndex]) {
                    end = midIndex - 1;
                } else {
                    start = midIndex + 1;
                }
            }
            System.out.println("Middle Index Value = " + midIndex);

            if (target == arr[midIndex]) {
                return midIndex;
            }
        }
        return -1;
    }

}
