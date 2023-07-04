package sorting;

import java.util.Arrays;

public class FindMissingNInCyclicSort {

    public static void main(String[] args) {
        //{0,1,2,3,4}
        int[] array = {3, 2, 0, 1};
        sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(missingValue(array));
    }

    static void sort(int[] array) {
        int i = 0;
        while (i < array.length) {
            int correctIndex = array[i];
            if (correctIndex < array.length && array[correctIndex] != array[i]) {
                swap(array, i, correctIndex);
            } else {
                i++;
            }
        }

    }

    static void swap(int[] array, int indexA, int indexB) {
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }

    static int missingValue(int[] array) {
        //case 1
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] != i) {
                return i;
            }
        }

        return i;
    }
}
