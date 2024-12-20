package recursion.pattern;

import java.util.Arrays;

public class SectionSortUsingRecursion {

    public static void main(String[] args) {
        System.out.println("Hari Bol");
        int[] arr = {4, 3, 2, 1};
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr, int r, int c, int maxIndex) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            if (arr[c] > arr[maxIndex]) {
                selectionSort(arr, r, c + 1, c);
            }else{
                selectionSort(arr, r, c + 1, maxIndex);
            }

        } else {

            int temp = arr[r-1];
            arr[r-1]  = arr[maxIndex];
            arr[maxIndex]= temp;

            selectionSort(arr, r - 1, 0, 0);
        }

    }


}
