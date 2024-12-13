package recursion;

import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target to get its position:");
        int target = sc.nextInt();
        int[] src = {1, 2, 5, 9, 13, 24, 88, 97, 99};
        int targetIndex = search(src, target, 0, src.length);
        System.out.println(targetIndex);
    }

    private static int search(int[] src, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (src[m] == target) {
            return m;
        }
        if (target > src[m]) {
            return search(src, target, m + 1, e);
        }
        return search(src, target, s, m - 1);
    }
}