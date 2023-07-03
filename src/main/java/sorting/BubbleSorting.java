package sorting;

import java.util.Arrays;

public class BubbleSorting {

    public static void main(String[] args) {

        int[] array = {-5, 4, 3, 2, 1};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sort(int[] array) {
        boolean isSwapped = false;

        for (int i = 0; i < array.length; i++) {

            for (int j = 1; j < array.length - i; j++) {

                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }

    }


}
