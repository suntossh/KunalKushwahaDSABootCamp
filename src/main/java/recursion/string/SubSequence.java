package recursion.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
       subSeq("","abc");
//        System.out.println(subSeqRet("","abc"));

//        subSeqAscii("","abc");
//
     //   System.out.println(subSeqRetAscii("", "abc"));
    }

    static void subSeq(String subsequence, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(subsequence);
            return;
        }
        char s = unprocessed.charAt(0);

        subSeq(subsequence + s, unprocessed.substring(1));
        subSeq(subsequence, unprocessed.substring(1));


    }

    static ArrayList<String> subSeqRet(String p, String unp) {

        if (unp.isEmpty()) {
            ArrayList list = new ArrayList();
            list.add(p);
            return list;
        }
        char ch = unp.charAt(0);

        ArrayList<String> leftList = subSeqRet(p + ch, unp.substring(1));
        ArrayList<String> rightList = subSeqRet(p, unp.substring(1));
        leftList.addAll(rightList);
        return leftList;

    }


    static void subSeqAscii(String subsequence, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(subsequence);
            return;
        }
        char s = unprocessed.charAt(0);

        subSeqAscii(subsequence + s, unprocessed.substring(1));
        subSeqAscii(subsequence, unprocessed.substring(1));
        subSeqAscii(subsequence + (s + 0), unprocessed.substring(1));

    }

    static List<String> subSeqRetAscii(String subsequence, String unprocessed) {
        if (unprocessed.isEmpty()) {
            List<String> subseqval = new ArrayList<>();

            if (!subsequence.isEmpty()) {
                subseqval.add(subsequence);
            }

            return subseqval;
        }
        char s = unprocessed.charAt(0);

        List<String> first = subSeqRetAscii(subsequence + s, unprocessed.substring(1));
        List<String> second = subSeqRetAscii(subsequence, unprocessed.substring(1));
        List<String> third = subSeqRetAscii(subsequence + (s + 0), unprocessed.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }


}
