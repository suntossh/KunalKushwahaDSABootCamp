public class InfiniteArraySearch {

    public static void main(String[] args) {
        System.out.println("Hari Bol");
        int[] array = {2, 3, 5, 9, 14, 16, 18, 25, 27, 33, 56, 77, 78};

        int index = ans(array, 77);
        System.out.println("index of number in infinite array = " + index);
        System.out.println(array[index]);

    }

    static int ans(int[] array, int target) {
        int start = 0;
        int end = 1;
        while (target > array[end - 1]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;

        }
        return binarySearchIndex(array, target, start, end);
    }

    public static int binarySearchIndex(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int midIndex = start + (end - start) / 2;
            System.out.println("Middle Index Value = " + midIndex);
            if (target < arr[midIndex]) {
                end = midIndex - 1;
            } else if (target > arr[midIndex]) {
                start = midIndex + 1;
            } else {
                return midIndex;
            }
        }
        return -1;
    }

}
