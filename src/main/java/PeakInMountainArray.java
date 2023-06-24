import java.rmi.server.RMIClassLoader;
import java.sql.SQLOutput;

public class PeakInMountainArray {



    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 4, 3, 2, 1};
        int peak = findPeakPosition(array);
        System.out.println("Peak In Mountain is "+array[peak]);
    }

    static int findPeakPosition(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            System.out.println("Start=" + start + " End = " + end + " total in between " + (end - start) + " elements");
            int middle = start + ((end - start) / 2);
            if (array[middle] > array[middle + 1]) { //
                end = middle;
            } else /*if (array[middle] < array[middle + 1])*/ {
                start = middle + 1;
            }
        }
        return start;
    }

}
