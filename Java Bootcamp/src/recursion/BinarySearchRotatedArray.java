package recursion;

public class BinarySearchRotatedArray {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};
        int target = 10;
        System.out.println(searchElement(arr,target,0,arr.length-1));
    }

    static int searchElement(int[] arr,int target,int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;
        }

        if(arr[start]<=arr[mid]){
            if(arr[start]<=target && arr[mid]>target){
                return searchElement(arr,target,start,mid-1);
            }
            else{
                return searchElement(arr,target,mid+1,end);
            }
        }

        if(arr[mid]<target && target < arr[end]){
            return searchElement(arr,target,mid+1,end);
        }

        else{
            return searchElement(arr,target,start,mid-1);
        }
    }
}
