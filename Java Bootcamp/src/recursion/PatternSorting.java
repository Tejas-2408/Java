package recursion;

import java.util.Arrays;

public class PatternSorting {
    public static void main(String[] args) {
//        int n = 4;
//        printTriangle(n);
//        printTriangle2(n,0);
        int[] arr = {3,4,1,2};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int r, int c){
        if(r==0){
            return;
        }

        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleSort(arr,r,c+1);
        }
        else{
            bubbleSort(arr,r-1,0);
        }

    }

    static void printTriangle(int n){
        if(n<1){
            return;
        }
        for(int i=0;i<n;i++){
            System.out.print("* ");
        }
        System.out.println();
        printTriangle(n-1);

    }

    static void printTriangle2(int r, int c){
        if(r == 0){
            return;
        }

        if(c<r){
            System.out.print("* ");
            printTriangle2(r,c+1);
        }
        else {
            System.out.println();
            printTriangle2(r-1,0);
        }
    }
}
