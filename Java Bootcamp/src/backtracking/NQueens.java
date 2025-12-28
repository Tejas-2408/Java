package backtracking;


import java.sql.SQLOutput;

public class NQueens {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] arr = new boolean[n][n];
        System.out.println(countPlaces(arr,0));
    }

    static int countPlaces(boolean[][] arr, int row){
        if(row == arr.length){
            display(arr);
            return 1;
        }

        int count = 0;

        for(int col = 0; col < arr.length; col++){
            // check if it is safe to place queen
            if(isSafe(arr,row,col)){
                arr[row][col] = true;
                count = count + countPlaces(arr,row+1);
                arr[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] arr, int row, int col) {
        for(int i = row; i >= 0; i--){
            if(arr[i][col]){
                return false;
            }
        }

        int left = Math.min(row,col);
        int right = Math.min(arr.length-1-col,row);

        for(int i = 1;i <= left; i++){
            if(arr[row-i][col-i]){
                return false;
            }
        }

        for(int i = 1; i <= right; i++){
            if(arr[row-i][col+i]){
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] arr) {
        for(boolean[] b : arr){
            for(boolean element : b){
                if(element){
                    System.out.print("Q");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
    }
}
