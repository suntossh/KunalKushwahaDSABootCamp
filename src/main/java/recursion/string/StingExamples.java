package recursion.string;

public class StingExamples {
    public static void main(String[] args) {
        String str = "abbaabbch";
        //code to remove all a.
        // this method uses a input string to get the Response
        // this does not have a return type
        //skip("", str);
        // this method returns updates string
        // this method has a return type
        //System.out.println(skip("abbaabbch"));
        System.out.println(skipApple("abbaaApplebbch"));
        System.out.println(skipAppFromApple("abbaaAppelbbch"));
    }

    static void skip(String skipped, String processed) {
        if (processed.isEmpty()) {
            System.out.println(skipped);
            return;
        }

        if (processed.charAt(0) == 'a') {
            skip(skipped, processed.substring(1));

        } else {
            skipped = skipped + processed.charAt(0);
            skip(skipped, processed.substring(1));
        }
    }

    static String skip(String processed) {
        if (processed.isEmpty()) {
            return processed;
        }
        char c = processed.charAt(0);
        if (processed.charAt(0) == 'a') {
            return "" + skip(processed.substring(1));
        } else {
            return processed.charAt(0) + skip(processed.substring(1));
        }
    }

    static String skipApple(String processed) {
        if (processed.isEmpty()) {
            return processed;
        }
        if (processed.startsWith("Apple")) {
            return "" + skipApple(processed.substring(5));
        } else {
            return processed.charAt(0) + skipApple(processed.substring(1));
        }
    }

    static String skipAppFromApple(String processed) {
        if (processed.isEmpty()) {
            return processed;
        }
        if (processed.startsWith("App") && !processed.startsWith("Apple")) {
            return "" + skipAppFromApple(processed.substring(3));
        } else {
            return processed.charAt(0) + skipAppFromApple(processed.substring(1));
        }
    }
}
