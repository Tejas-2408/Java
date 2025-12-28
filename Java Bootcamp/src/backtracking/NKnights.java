package backtracking;

import java.sql.SQLOutput;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] arr = new boolean[n][n];
        System.out.println(countWays(arr,0,0,n));
    }

    static int countWays(boolean[][] arr, int row, int col, int knights){
        if(knights == 0){
            display(arr);
            return 1;
        }

        int count = 0;

        if(row == arr.length-1 && col == arr.length){
            return 0;
        }

        if(col == arr.length){
            count += countWays(arr,row+1,0,knights);
            return count;
        }

        if(isSafe(arr,row,col)){
            arr[row][col] = true;
            count += countWays(arr,row,col+1,knights-1);
            arr[row][col] = false;
        }

        count += countWays(arr,row,col+1,knights);

        return count;
    }

    static boolean isSafe(boolean[][] arr, int row, int col){
        if(isValid(arr,row-2,col-1)){
            if(arr[row-2][col-1]){
                return false;
            }
        }

        if(isValid(arr,row-2,col+1)){
            if(arr[row-2][col+1]){
                return false;
            }
        }

        if(isValid(arr,row-1,col-2)){
            if(arr[row-1][col-2]){
                return false;
            }
        }

        if(isValid(arr,row-1,col+2)){
            if(arr[row-1][col+2]){
                return false;
            }
        }
        return true;
    }

    static boolean isValid(boolean[][] arr, int row, int col){
        if(row >= 0 && row < arr.length && col >= 0 && col < arr.length){
            return true;
        }
        return false;
    }

    static void display(boolean[][] arr){
        for(boolean[] b : arr){
            for(boolean element : b){
                if(element){
                    System.out.print("K ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------");
    }
}
