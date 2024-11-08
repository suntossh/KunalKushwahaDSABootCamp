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
        int[] arr = {3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
// 3, 5, 2, 1, 4
    // check if value for current index is at correct expected index. if not then swap else move forward
    //
    private static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // what should be index for 3 value
            int correctIndex = arr[i] - 1;
            // check weather this index is i or not .
            // if the array of my i is not eq to element at the correct index then swap.
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
