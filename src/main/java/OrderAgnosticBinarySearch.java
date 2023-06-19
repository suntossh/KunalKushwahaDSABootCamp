import java.util.Arrays;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        System.out.println("Hari Bol");
        //int[] array = {1, 2, 22, 43, 88, 93, 202, 203, 1001, 1200, 1900, 2500};
        int[] array = {-1, -2, -22, -43, -88, -93, -202, -203, -1001, -1200, -1900, -2500};

        int index = binarySearchIndex(array, -2500);
        System.out.println(index);

    }

    public static int binarySearchIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[0] < arr[arr.length-1];
        System.out.println(Arrays.toString(arr) + " Array isAsc "+isAsc);


        while (start <= end) {

            int midIndex = start + ((end - start) / 2);


            if(isAsc){
                if ( target < arr[midIndex]) {
                    end = midIndex - 1;
                } else  {
                    start = midIndex + 1;
                }
            }else{
                if ( target > arr[midIndex]) {
                    end = midIndex - 1;
                } else {
                    start = midIndex + 1;
                }
            }
            System.out.println("Middle Index Value = " + midIndex);

            if(target == arr[midIndex]){
                return midIndex;
            }
        }
        return -1;
    }
}
