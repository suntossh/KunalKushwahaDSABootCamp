package sorting.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingInCyclicSortGoogle {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(missingInArray(arr));
    }

    private static List<Integer> missingInArray(int[] arr) {
        List<Integer> missArr = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                missArr.add(i + 1);
            }
        }
        return missArr;
    }

    private static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
