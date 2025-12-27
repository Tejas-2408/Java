package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,7};
        System.out.println(Arrays.toString(arr));
//        arr = mergeSort(arr);
//        System.out.println(Arrays.toString(arr));
        mergeSortInPlace(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));



    }

    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }

        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merging(left,right);
    }

    static void mergeSortInPlace(int[] arr, int s, int e){
        if(e-s==1){
            return;
        }

        int mid = s + (e-s)/2;
        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);

        mergingInPlace(arr,s,mid,e);
    }

    static int[] merging(int[] a, int[] b){
        int i=0, j=0, index=0;
        int[] arr = new int[a.length+b.length];
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                arr[index] = a[i];
                i++;
            }
            else{
                arr[index] = b[j];
                j++;
            }
            index++;
        }
        while (i < a.length){
            arr[index] = a[i];
            i++;
            index++;
        }

        while (j < b.length){
            arr[index] = b[j];
            j++;
            index++;
        }

        return arr;
    }

    static void mergingInPlace(int[] arr, int s, int m, int e){
        int i=s, j=m, index=0;
        int[] ans = new int[e-s];
        while(i<m && j<e){
            if(arr[i]<arr[j]){
                ans[index] = arr[i];
                i++;
            }
            else{
                ans[index] = arr[j];
                j++;
            }
            index++;
        }
        while (i < m){
            ans[index] = arr[i];
            i++;
            index++;
        }

        while (j < e){
            ans[index] = arr[j];
            j++;
            index++;
        }

        for(int l = 0;l<ans.length;l++) arr[s + l] = ans[l];
    }
}
