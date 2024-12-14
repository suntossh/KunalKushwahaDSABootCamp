package recursion;

import java.util.ArrayList;
import java.util.List;

public class Find {
    public static void main(String[] args) {

        int[] arr = {4, 4, 4, 4, 5, 7, 8};
        //System.out.println(find(arr, -31, 0));
        //System.out.println(findIndex(arr, -3, 0));
        //System.out.println(findIndexLast(arr, -3, arr.length-1));
        List<Integer> allIndices = new ArrayList<Integer>();
        findAllIndex(arr, 4, 0, allIndices);
        System.out.println(allIndices);

    }

    public static boolean find(int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return false;
        }

        return arr[index] == target || find(arr, target, index + 1);

    }

    public static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index + 1);

    }

    public static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndexLast(arr, target, index - 1);

    }

    public static void findAllIndex(int[] arr, int target, int index, List<Integer> allInd) {
        if (index == arr.length - 1) {
            return;
        }
        if (arr[index] == target) {
            allInd.add(index);
        }
        findAllIndex(arr, target, index + 1, allInd);
    }

//    public static List<Integer> findAllIndex2(int[] arr, int target, int index) {
//        List<Integer> indices = new ArrayList<Integer>();
//        if (index == arr.length - 1) {
//            return indices;
//        }
//        if (arr[index] == target) {
//            indices.add(index);
//        }
//        findAllIndex2(arr, target, index + 1, allInd);
//    }

}
