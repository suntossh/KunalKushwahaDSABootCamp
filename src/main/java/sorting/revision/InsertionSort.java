package sorting.revision;


import java.util.Arrays;

/**
 * For every Pass move the element to the left side
 * means
 * [5,4,3,1,2]
 * for i=0(ie first pass) compare j=1 to j=0 and if arr[j of 1] < arr[j of 0] then swap.
 *
 * means, J will work on the reverse order
 *
 *
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void insertionSort(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j-1,j);
                }else{
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
