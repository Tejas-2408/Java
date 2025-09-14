package sorting;

import java.util.Arrays;

// When the numbers are in range 1 to N
// Need to sort array in O(N) time complexity

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,4};
        int[] arr2 = {5,4,3,2,1};
        int[] arr3 = {3,5,1,2,4};
        System.out.println(Arrays.toString(arr3));
        cyclicSort(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    public static void cyclicSort(int[] arr){
       int i = 0;
       while(i<arr.length){
           int correct = arr[i]-1;
           if(arr[i]!= arr[correct]){
               swap(arr,i,correct);
           }
           else{
               i++;
           }
       }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
