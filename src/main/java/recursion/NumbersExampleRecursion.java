package recursion;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers: 1 2 3 4 5
        System.out.println("Hari Bol");

        print(1);

    }

    private static void print(int i) {
        if(5 == i){
            System.out.println(i);
            return ;
        }
        System.out.println(i);
        print(i+1);
    }
}
