package recursion.string;

import java.util.ArrayList;
import java.util.List;

public class SubSetIterativeSoln {
//    [1,2,3]
//
//            [],[1][2][1,2][3],[1,3][2,3][1,2,3]


    public static void main(String[] args) {
        String[] arr = {"1", "2", "3"};
        List<List<String>> subseqences = subSet(arr);
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
}
