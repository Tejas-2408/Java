package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,56,78,90};
        /*
        1. Array should be sorted
        2. Find the middle element
        3. Compare the middle element with target and shift and end pointers accoridingly
            if target>mid => search in right
            else if target<mid => search in left
            if target == mid => we have the answer
         */

        int s=0, e = arr.length-1;
        int target = 14;

        while(s<=e){
            int mid = (s+e)/2;
            if(target==arr[mid]){
                System.out.println("Element "+target+" is found at index "+mid);
                break;
            }

            else if (target>arr[mid]){
                s = mid+1;
            }
            else if(target<arr[mid]){
                e = mid-1;
            }

        }
    }
}
