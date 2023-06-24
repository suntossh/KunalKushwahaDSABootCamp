public class Floor {

    public static void main(String[] args) {
        System.out.println("Hari Bol");
        int[] array = {2, 3, 5, 9, 14, 16, 18};
        int floor = findFloor(array, 15);
        System.out.println("Floor, index of biggest number less than equal to target = "+floor);
        System.out.println(array[floor]);

    }

    public static int findFloor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int midIndex = start + ((end - start) / 2);
            System.out.println("Middle Index Value = " + midIndex);
            if ( target < arr[midIndex]) {
                end = midIndex - 1;
            } else if (target > arr[midIndex]) {
                start = midIndex + 1;
            } else {
                return midIndex;
            }
        }
        return end;
    }
}
