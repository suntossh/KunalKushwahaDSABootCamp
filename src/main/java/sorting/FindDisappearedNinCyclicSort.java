package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNinCyclicSort {

    public static void main(String[] args) {
        //{0,1,2,3,4}
        int[] array = {5, 4, 1, 4, 1, 0};
        sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(disappearedNumbers(array));
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

    static List<Integer> disappearedNumbers(int[] array) {
        List<Integer> disNums = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] != i) {
                disNums.add(i);
            }
        }

        return disNums;
    }
}
