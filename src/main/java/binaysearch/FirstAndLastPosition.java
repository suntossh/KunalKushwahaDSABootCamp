package binaysearch;

import java.util.Arrays;

public class FirstAndLastPosition {

    public static void main(String[] args) {
        System.out.println("Hari Bol");
        int[] array = {2, 3, 4, 5, 5, 5, 18};
        int first = findPosition(array, 5, true);
        int last = findPosition(array, 5, false);

        System.out.println("First And Last Position, is= " + Arrays.toString(new int[]{first, last}));


    }

    public static int findPosition(int[] arr, int target, boolean findFirst) {
        int start = 0;
        int end = arr.length - 1;
        int answer = -1;

        while (start <= end) {
            int midIndex = start + ((end - start) / 2);
            System.out.println("Middle Index Value = " + midIndex);
            if (target < arr[midIndex]) {
                end = midIndex - 1;
            } else if (target > arr[midIndex]) {
                start = midIndex + 1;
            } else {
                answer = midIndex;
                if (findFirst) {
                    end = midIndex - 1;
                } else {
                    start = midIndex + 1;
                }
            }
        }
        return answer;
    }
}
