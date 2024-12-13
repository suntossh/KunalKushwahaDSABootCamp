package sorting.revision;

public class FindDuplicatesRevision {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(duplicate(arr));
    }
// {0, 1, 2, 3, 4} index
// {1, 3, 4, 2, 2} value

    private static int duplicate(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] != index + 1) { //
                int correctIndex = arr[index] -1;
                swap(arr,index,correctIndex);
//                if(arr[correctIndex] ){
//
//                }else{
//
//                }
            }else{
                index++;
            }
        }
        return 1000000;
    }

    static void swap(int[] array, int indexA, int indexB) {
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }

}
