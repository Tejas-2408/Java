package recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(searchIndex(arr,3,0));
        int[] arr2 = {1,2,3,4,5,4,5,6};
        // creating global arraylist to store indexes
        System.out.println(searchAllIndex(arr2,5,0));

        // passing arraylist as an argument
        System.out.println(searchAllIndex(arr2,4,0,new ArrayList<>()));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = searchAllIndex(arr2,5,0,list);
        System.out.println(list);
        System.out.println(ans);

        // returning arraylist without passing list as an argument and creating new list everytime
        System.out.println(searchAllIndexList(arr2,4,0));
    }

    static int searchIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }

        return searchIndex(arr,target,index+1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> searchAllIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return searchAllIndex(arr,target,index+1);
    }

    static ArrayList<Integer> searchAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return searchAllIndex(arr,target,index+1,list);
    }

    static ArrayList<Integer> searchAllIndexList(int[] arr,int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> listFromBelowCalls = searchAllIndexList(arr,target,index+1);
        list.addAll(listFromBelowCalls);
        return list;
    }
}
