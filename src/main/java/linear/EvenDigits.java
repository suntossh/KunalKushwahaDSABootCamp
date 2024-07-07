package linear;

public class EvenDigits {
    public static void main(String[] args) {
        int[] inputs = {10, 222, 3423, 1, -2, -4345, -223, 0};
        int countOfEvenDigits = findNumbers(inputs);
        System.out.println(countOfEvenDigits);

    }

    public static int findNumbers(int[] inputs){
        int count=0;

        for (int number: inputs) {
            if(isNumberEven(number)){
                count++;
            }
        }
        return count;
    }

    public static boolean isNumberEven(int number){
        int digits = 0;
        if(number == 0){
            return false;
        }
        if(number<0){
            number = number * -1;
        }

        while (number > 0){
            number = number/10;
            digits++;
        }
        if(digits % 2 == 0){
            return true;
        }
        return false;
    }

}
