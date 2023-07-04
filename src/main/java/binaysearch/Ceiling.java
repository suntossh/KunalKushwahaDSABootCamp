package binaysearch;

public class Ceiling {

    public static void main(String[] args) {
        System.out.println("Hari Bol");
        int[] array = {2, 3, 5, 9, 14, 16, 18};
        int ceiling = findCeiling(array, 15);
        System.out.println("ceiling, index of smallest number greater than equal to target = " + ceiling);


    }

    public static int findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int midIndex = start + ((end - start) / 2);
            System.out.println("Middle Index Value = " + midIndex);
            if (target < arr[midIndex]) {
                end = midIndex - 1;
            } else if (target > arr[midIndex]) {
                start = midIndex + 1;
            } else {
                return midIndex;
            }
        }
        return start;
    }
}
