package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 9;
        System.out.println(linearSearch(arr,target));
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length==0) return -1;

        for(int index = 0; index<arr.length;index++){
            if(arr[index]==target) return index;
        }

        return -1;
    }
}
