package recursion;

public class ArraySortCheck {
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,6,7};
        System.out.println(checkSorting(arr,0));

    }

    public static boolean checkSorting(int[] arr, int i){
        if(i<arr.length-1){
            return arr[i]<arr[i+1] && checkSorting(arr,i+1);
        }

        return true;
    }
}
