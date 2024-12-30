package recursion.string;

import java.util.ArrayList;
import java.util.List;

public class Permutations {



    public static void main(String[] args) {
        System.out.println("I/P : permutationOfString(\"\",\"abc\")");
        System.out.println("O/P ");
        permutationOfString("", "abc");
        System.out.println("------------------------------------------------");
        System.out.println("I/P : permutationCount(\"\",\"abc\")");
        System.out.println("O/P ");
        System.out.println(permutationCount("", "abc"));
        System.out.println("------------------------------------------------");

        System.out.println("I/P : permutationOfStringReturnArray(\"\",\"abc\")");
        System.out.println("O/P ");
        System.out.println(permutationOfStringReturnArray("", "abc"));
        System.out.println("------------------------------------------------");


    }

    //
    static void permutationOfString(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unProcessed.charAt(0);
        // here we don't know how many time do we need to call recursively
        unProcessed = unProcessed.substring(1);
        for (int i = 0; i <= processed.length(); i++) {
            // Logic of st and end is important
            // Assume You understand the subsequence logic building, then we know we have to create
            // remember processed, unprocessed. each char of unprocessed and where to place it when moving to processed
            // this char can be ahead or after each char of processed --> https://www.youtube.com/watch?v=gDGw0cvFXPQ
            String st = processed.substring(0, i);
            String end = processed.substring(i, processed.length());
            permutationOfString(st + ch + end, unProcessed);
        }

    }

    static List<String> permutationOfStringReturnArray(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            List<String> strings = new ArrayList<>();
            strings.add(processed);
            return strings;
        }
        char ch = unProcessed.charAt(0);
        // here we dont know how many time do we need to call recursively
        unProcessed = unProcessed.substring(1);
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i <= processed.length(); i++) {
            String st = processed.substring(0, i);
            String end = processed.substring(i, processed.length());
            stringList.addAll(permutationOfStringReturnArray(st + ch + end, unProcessed));
        }
        return stringList;
    }


    static int permutationCount(String processed, String unProcessed) {
        int count = 0;
        if (unProcessed.isEmpty()) {
            //System.out.println(processed);
            return 1;
        }
        char ch = unProcessed.charAt(0);
        // here we dont know how many time do we need to call recursively
        unProcessed = unProcessed.substring(1);
        for (int i = 0; i <= processed.length(); i++) {
            String st = processed.substring(0, i);
            String end = processed.substring(i, processed.length());
            count = count + permutationCount(st + ch + end, unProcessed);
        }
        return count;
    }
}
