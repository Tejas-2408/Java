package searching;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {5,4,3,2,1};

        System.out.println(orderAgnosticBS(arr1,4));
        System.out.println(orderAgnosticBS(arr2,4));
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start =0, end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;  // using this to avoid any memory exceeding condition

            if(arr[mid] == target) return mid;

            if(isAsc){
                if(target>arr[mid]) start = mid+1;
                else end = mid-1;
            }

            else{
                if(target>arr[mid]) end = mid-1;
                else start = mid+1;
            }
        }

        return -1;
    }
}
