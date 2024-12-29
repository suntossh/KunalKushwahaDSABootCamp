package recursion.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetIterativeSoln {
//    [1,2,3]
//
//            [],[1][2][1,2][3],[1,3][2,3][1,2,3]


    public static void main(String[] args) {
        //String[] arr = {"1", "2", "3"};
        String[] arr = {"1", "2", "2"};
        List<List<String>> subseqences = subSetDuplicateII(arr);
        System.out.println(subseqences);


    }

    private static List<List<String>> subSet(String[] arr) {
        List<List<String>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (String str : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<String> tempList = new ArrayList<String>(outer.get(i));
                tempList.add(str);
                outer.add(tempList);
            }
        }
        return outer;
    }

    private static List<List<String>> subSetDuplicate(String[] arr) {
        Arrays.sort(arr);
        List<List<String>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        String prev = null;
        String curr = null;
        for (String str : arr) {
            int n = outer.size();
            int index = 0;
            if (str.equalsIgnoreCase(prev)) {
                index = (outer.size() / 2);
                n = (outer.size() / 2);
            }
            prev = str;
            for (int i = 0; i < n; i++) {
                List<String> tempList = new ArrayList<String>(outer.get(i + index));
                tempList.add(str);
                outer.add(tempList);
            }
        }
        return outer;
    }

    private static List<List<String>> subSetDuplicateII(String[] arr) {
        Arrays.sort(arr);
        List<List<String>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for (int j = 0; j < arr.length; j++) {
            if (j > 0 && arr[j] == arr[j - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int i = start; i < n; i++) {
                List<String> tempList = new ArrayList<String>(outer.get(i));
                tempList.add(arr[j]);
                outer.add(tempList);
            }
        }
        return outer;
    }
}
