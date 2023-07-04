package sorting;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {

        int[] array = {-12, 1};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
        int[] array2 = {1, 1, 2, 3, 4, -1};

        selectionSort(array2);
        System.out.println(Arrays.toString(array2));

        int[] array3 = {1, 1, 2, 3, 4, -1};

        insertionSort(array3);
        System.out.println(Arrays.toString(array3));

    }


    private static void insertionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    private static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int lastIndex = array.length - i - 1;
            int maxIndex = getMaxIndex(array, 0, lastIndex);
            swap(array, maxIndex, lastIndex);

        }

    }

    private static void swap(int[] array, int maxIndex, int lastIndex) {
        int temp = array[maxIndex];
        array[maxIndex] = array[lastIndex];
        array[lastIndex] = temp;
    }

    private static int getMaxIndex(int[] array, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
        }

        return max;

    }


    private static void bubbleSort(int[] array) {
        boolean isSwapped = false;

        for (int i = 0; i < array.length; i++) {

            for (int j = 1; j < array.length - i; j++) {

                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }

    }


}
