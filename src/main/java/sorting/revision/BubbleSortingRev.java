package sorting.revision;

import java.util.Arrays;

public class BubbleSortingRev {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, -1, -4, -2};

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {

        int max = Integer.MIN_VALUE;
        boolean isSwapped;
        for (int i = 0; i < arr.length - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    max = arr[j];
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;

                }
            }
            if (!isSwapped) {
                break;
            }

        }


    }


}
