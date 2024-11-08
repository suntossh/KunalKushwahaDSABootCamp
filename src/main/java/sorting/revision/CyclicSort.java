package sorting.revision;

import java.util.Arrays;

/**
 * Check Swap Move.
 * Basically when ever You see finding something in a Range o to n or 1 to n then use cyclic sort
 * So {4,2,3,1,5}
 * check if 4 is at correct index, no it is at 0 and it should be at 3, so swap it with correct index value
 * 1,2,3,4,5... tadaaaaaa
 * now move index
 * now check if 2 is at correct index, Yes it is at 1 which is correct
 * no swap but move the index
 * like this do it untill index is less than or equal to length.
 */
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            int correctIndex = arr[index] - 1;
            if (arr[index] != arr[correctIndex]) {
                swap(arr, index, correctIndex);
            } else {
                index++;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
