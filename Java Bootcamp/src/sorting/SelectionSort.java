package sorting;

import java.util.Arrays;

// Select a element and put it in correct place

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,4};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            // find the max item in the remaining array and swap with correct values
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swapArray(arr,maxIndex,last);
        }
    }

    public static void swapArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}
