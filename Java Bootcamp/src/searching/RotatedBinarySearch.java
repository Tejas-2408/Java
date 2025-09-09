package searching;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 1, 2};
        int[] arr3 = {1};
        System.out.println(pivotIndex(arr));
        System.out.println(pivotIndexwithDuplicates(arr3));
    }

    static int pivotIndex(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;

            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;
            if (arr[start] >= arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1;
    }

    static int pivotIndexwithDuplicates(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;

            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;

            // if all start, mid and end elements are equal
            if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                if(arr[start]>arr[start+1])
                    return start;
                start++;

                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start]<arr[mid] || arr[start] == arr[mid] && arr[mid]>arr[end]){
                start = mid+1;
            }
            else
                end = mid-1;
        }

        return -1;
    }

    static int search(int[] nums, int target) {
        int pivotIndex = pivotIndex(nums);

        // If pivotIndex = -1, array is simple sorted and run normal binary search
        if (pivotIndex == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        if (nums[pivotIndex] == target)
            return pivotIndex;
        else if (nums[0] <= target)
            return binarySearch(nums, target, 0, pivotIndex - 1);
        else
            return binarySearch(nums, target, pivotIndex + 1, nums.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }


}
