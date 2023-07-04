package sorting;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {

        int[] array = {3, 5, 2, 1, 4};
        sort(array);
        System.out.println(Arrays.toString(array));

    }

    static void sort(int[] array) {
        int i = 0;
        while (i < array.length) {
            int correctIndex = array[i] - 1;// 2
            if (array[correctIndex] != array[i]) {
                swap(array, i, correctIndex);
                //   2, 5, 3, 1, 4
                //   5, 2, 3, 1, 4
                //   4, 2, 3, 1, 5
                //   1, 2, 3, 4, 5

            } else {
                i++;
            }
        }

    }


    private static void swap(int[] array, int indexA, int indexB) {
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }
}
