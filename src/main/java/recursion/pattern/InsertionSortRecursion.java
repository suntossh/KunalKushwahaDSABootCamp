package recursion.pattern;

import java.util.Arrays;

public class InsertionSortRecursion {
    public static void main(String[] args) {
        // Idea is [5,4,3,2,1] break the array in half and then sort each half
        // then compare the elements from each half and insert smaller elements
        // from the previous sorted half in a 3rd New Array
        // return this 3rd Array.

        int[] arr = {5, 4, 3, 2, 1};
        int[] sortedArr = sort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    private static int[] sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] firstArray = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] secondArray = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeByInsertingInNewArray(firstArray, secondArray);
    }

    private static int[] mergeByInsertingInNewArray(int[] firstArray, int[] secondArray) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mergedArr = new int[firstArray.length + secondArray.length];

        while (i < firstArray.length && j < secondArray.length) {
            if (firstArray[i] < secondArray[j]) {
                mergedArr[k] = firstArray[i];
                i++;
            } else {
                mergedArr[k] = secondArray[j];
                j++;
            }
            k++;
        }
        //there is a chance that one of the array will finish before other array
        // so we need to add the left over array item at the end of the 3rd Array.
        while (i < firstArray.length) {
            mergedArr[k] = firstArray[i];
            i++;
            k++;
        }

        while (j < secondArray.length) {
            mergedArr[k] = secondArray[j];
            j++;
            k++;
        }

        return mergedArr;
    }


}
