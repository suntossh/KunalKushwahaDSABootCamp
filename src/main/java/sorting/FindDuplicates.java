package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] array = {4,3,2,7,8,2,3,1};
        sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(duplicates(array));
    }

    static void sort(int[] array) {
        int i = 0;
        while (i < array.length) {
            int correctIndex = array[i]-1;
            if (array[correctIndex] != array[i]) {
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

    static List<Integer> duplicates(int[] array) {

        List<Integer> dupls = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i+1) {
                dupls.add(array[i]);
            }
        }

        return dupls;
    }
}
