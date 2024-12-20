package recursion.pattern;

import java.util.Arrays;

public class InPlaceInsertionSortRecursion {
    public static void main(String[] args) {
        // Idea is [5,4,3,2,1] break the array in half and then sort each half
        // then compare the elements from each half and insert smaller elements
        // from the previous sorted half in a 3rd New Array
        // return this 3rd Array.

        int[] arr = {5, 4, 3, 2, 1};
        sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }

        int mid = (start + end) / 2;

        sort(arr, 0, mid);
        sort(arr, mid, end);

        mergeByInplaceInsertingInNewArray(arr, start, mid, end);
    }

    private static void mergeByInplaceInsertingInNewArray(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid;
        int k = 0;
        int[] mergedArr = new int[end - start];

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mergedArr[k] = arr[i];
                i++;
            } else {
                mergedArr[k] = arr[j];
                j++;
            }
            k++;
        }
        //there is a chance that one of the array will finish before other array
        // so we need to add the left over array item at the end of the 3rd Array.
        while (i < mid) {
            mergedArr[k] = arr[i];
            i++;
            k++;
        }

        while (j < end) {
            mergedArr[k] = arr[j];
            j++;
            k++;
        }



        for (int l = 0; l < mergedArr.length; l++) {
            arr[start + l] = mergedArr[l];
        }
    }


}
