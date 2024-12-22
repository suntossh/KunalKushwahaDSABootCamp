package recursion.string;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        subSeq("","abc");
        System.out.println(subSeqRet("","abc"));
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
            ArrayList list= new ArrayList();
            list.add(p);
            return list;
        }
        char ch = unp.charAt(0);

        ArrayList<String> leftList = subSeqRet(p + ch, unp.substring(1));
        ArrayList<String> rightList = subSeqRet(p, unp.substring(1));
        leftList.addAll(rightList);
        return leftList;

    }
}
