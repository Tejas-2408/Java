package searching;

public class BinarySearchPractice {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,12,16,19,20};
        int target = 14;

        // Ceiling of number
        // smallest element in array which is greater or equal to target value

        System.out.println(ceilingValue(arr,target));

        // Floor number
        // biggest element in array smaller or equal to target value
        System.out.println(floorValue(arr,target));


    }

    static int floorValue(int[] arr, int target){
        int start=0, end = arr.length-1;
        if(arr[start]>target)
            return -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]==target)
                return target;

            if(arr[mid]<target)
                start = mid+1;
            else
                end = mid-1;
        }

        return arr[end];
    }

    static int ceilingValue(int[] arr, int target){
        int start = 0, end = arr.length-1;
        if(arr[end]<target)
            return -1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]==target)
                return target;
            if(arr[mid]<target)
                start = mid+1;
            else
                end = mid-1;
        }

        return arr[start];
    }
}
