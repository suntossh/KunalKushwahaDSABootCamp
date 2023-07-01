package binaysearch.twodarray;

import java.util.Arrays;

public class RowColMatrix {


    public static void main(String[] args) {
        int[][] matric = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(matric, 50)));

    }

    public static int[] search(int[][] matrix, int target){
        int row = 0;
        int column = matrix.length-1;

        while(row < matrix.length && column >= 0){
            if(matrix[row][column] == target){
                return new int[] {row, column};
            }
            if(matrix[row][column] > target){
                column--;
            }else{
                row++;
            }
        }
        return new int[] {-1, -1};
    }

}
