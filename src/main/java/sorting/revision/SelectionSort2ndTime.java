package sorting.revision;

import java.util.Arrays;

/* my Notes ******** suntossh
 *  Select a correct element and place it in its correct position
 *  means, for every iteration/pass select a max element and place it in the end of array
 *  in first pass biggest element is placed in last index/position
 *  in second pass second biggest elemt is place in second last index/position
 *
 * */


public class SelectionSort2ndTime {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, -55, -3, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    private static void selectionSort(int[] arr) {
        //iterate
        for (int i = 0; i < arr.length; i++) {
            //find max element
            int maxIndex = maxElementIndex(arr, 0, arr.length - 1 - i);
            //place max in correct position
            System.out.println(maxIndex);
            swapForSelectionSort(arr, maxIndex, arr.length - 1 - i);

        }
    }

    private static void swapForSelectionSort(int[] arr, int maxIndex, int correctPosition) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[correctPosition];
        arr[correctPosition] = temp;
    }

    private static int maxElementIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }

        return max;
    }
}
