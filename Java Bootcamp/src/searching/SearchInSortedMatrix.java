package searching;

import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int target = 3;
        System.out.println(Arrays.toString(search(arr,target)));
    }


    static public int[] binarySearch(int[][] arr, int target, int row, int cstart, int cend){
        while(cstart<=cend){
            int mid = cstart + (cend-cstart)/2;

            if(arr[row][mid]==target){
                return new int[]{row,mid};
            }

            if(arr[row][mid]<target){
                cstart = mid+1;
            }
            else{
                cend = mid-1;
            }
        }
        return new int[] {-1,-1};
    }


    static public int[] search(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;

        if(rows==1){
            return binarySearch(arr,target,0,0,cols-1);
        }

        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;

        // run only till 2 rows are remaining
        while(rStart<(rEnd-1)){
            int mid = rStart + (rEnd-rStart)/2;

            if(arr[mid][cMid]==target){
                return new int[] {mid,cMid};
            }

            if(arr[mid][cMid]<target){
                rStart = mid;
            }
            else{
                rEnd = mid;
            }

        }

        // now we have two rows remaining
        // check whether the target is int col of 2 rows
        if(arr[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(arr[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }

        // search in 1st half
        if(target <= arr[rStart][cMid-1]){
            return binarySearch(arr,target,rStart,0,cMid-1);
        }
        // search in 2nd half
        if(target >= arr[rStart][cMid+1]){
            return binarySearch(arr,target,rStart,cMid+1,arr[0].length-1);
        }
        // search in 3rd half
        if(target <= arr[rStart+1][cMid-1]){
            return binarySearch(arr,target,rStart+1,0,cMid-1);
        }
        // search in 4th half
        else{
            return binarySearch(arr,target,rStart+1,cMid+1,arr[0].length-1);
        }
    }
}
