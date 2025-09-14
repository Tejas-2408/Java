package sorting;

import java.util.Arrays;

/*
Divide the array in parts and sort each part
Put the current element at the correct index of LHS
2,5,4,3,1
1st -> 2,5,4,3,1
2nd -> 2,4,5,3,1
3rd -> 2,3,4,5,1
4th -> 1,2,3,4,5
 */

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,5,4,3,1};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public  static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int j = i+1;
            while(j>0){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
                j--;
            }
        }
    }
}
