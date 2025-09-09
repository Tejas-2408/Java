package arrays;

import java.util.Arrays;

public class MultiDimensional {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
         */

        // int[][] arr = new int[3][] initializing columns is not mandatory
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(arr));

        for(int[] i:arr){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
