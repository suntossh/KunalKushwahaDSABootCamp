package sorting.revision;

import java.util.Arrays;

public class FindMissingNinCyclicSortRev {
    public static void main(String[] args) {

        //find missing val in an array of range n, means 0 to n.
        // with in place space complexity o(1) and o(n) time complexity
        int[] arr = {4,0,1,2}; //int[] arr = {3,0,1,2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("missing value:"+findMissing(arr));
    }

    private static int findMissing(int[] arr) {
        for(int i=0;i< arr.length;i++){
            if(arr[i] != i){
                return i;
            }
        }
        return arr.length;
    }

    private static void cyclicSort(int[] arr) {
        int i=0;
        while(i< arr.length){
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
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
