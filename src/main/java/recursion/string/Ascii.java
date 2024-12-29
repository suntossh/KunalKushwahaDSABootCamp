package recursion.string;

public class Ascii {
    // how to print an Ascii value of a character
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(ch);
        System.out.println((char)(ch+0));

        // char and overloaded + operator will print the Ascii value of a char
        System.out.println(ch+0);

    }
}

//It will Print below
//        a
//        97
//        a