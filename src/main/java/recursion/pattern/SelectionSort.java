package recursion.pattern;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, -55, -3, 2, 1};

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int lastIndexForMax = arr.length - 1 - i;
            int maxValIndex = findMaxValIndex(arr, 0, lastIndexForMax);
            swap(arr, maxValIndex, lastIndexForMax);

        }


    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int findMaxValIndex(int[] arr, int startIndex, int lastIndexForMax) {
        int max = startIndex;
        for (int i = 0; i < lastIndexForMax; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
