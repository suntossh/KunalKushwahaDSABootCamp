package sorting;

import java.util.Arrays;

public class FindDuplicate {

    public static void main(String[] args) {

        int[] array = {3, 3, 2, 1, 4};
        System.out.println(findDuplicate(array));

    }

    static int findDuplicate(int[] array) {
        int i = 0;
        while (i < array.length) {

            if (array[i] != i + 1) {
                int correctIndex = array[i] - 1;

                if (array[correctIndex] != array[i]) {
                    swap(array, i, correctIndex);

                } else {
                    return array[i];
                }

            } else {
                i++;
            }

        }

        return -1;

    }


    private static void swap(int[] array, int indexA, int indexB) {
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }
}
