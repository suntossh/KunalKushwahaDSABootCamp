package recursion.pattern;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Hari Bol");
        int[] arr = {4, 3, 2, 1};
        sort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    // Bazinga!
    // What I understood now is by using row and col analogy,
    // I can simulate an iteration action in recursion,
    // imagine You can process data visible in a tapering Triangle
    // first we go through 4, 3, 2, 1 from  arr[]
    // then -, -, -
    // then -, -
    // then -
    static void sort(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                swap(arr, col, col + 1);
            }
            sort(arr, row, col + 1);
        } else {
            sort(arr, row - 1, 0);
        }

    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
