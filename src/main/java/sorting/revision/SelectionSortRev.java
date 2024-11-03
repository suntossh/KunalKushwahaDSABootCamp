package sorting.revision;

import java.util.Arrays;

public class SelectionSortRev {
    public static void main(String[] args) {
        int[] arr = {5, 2, -4, 3};

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

//       find last index
            int lastIndex = arr.length - 1 - i;
//       find index of max
            int maxIndex = findMaxIndex(arr, 0, lastIndex);
            // swap
            swapForSelectionSort(arr, maxIndex, lastIndex);
        }


    }

    private static void swapForSelectionSort(int[] arr, int maxIndex, int lastIndex) {
        int temp = arr[lastIndex];
        arr[lastIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
    }

    private static int findMaxIndex(int[] arr, int start, int lastIndex) {
        int max = start;
        for (int i = 0; i <= lastIndex; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }


}
