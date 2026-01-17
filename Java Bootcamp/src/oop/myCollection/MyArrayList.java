package oop.myCollection;

import java.util.Arrays;

class MyList{
    private int[] arr;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public MyList() {
        arr = new int[DEFAULT_SIZE];
    }

    void add(int i){
        if(isFull()){
            resize();
        }
        arr[size++] = i;
    }

    private void resize() {
        int[] temp = new int[2 * arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    private boolean isFull() {
        return size == arr.length;
    }

    int size(){
        return size;
    }

    int remove(){
        if(size > 0){
            return arr[--size];
        }
        return -1;
    }

    public String toString(){
        return "My List is [" + Arrays.toString(arr) + "]";
    }
}


class MyListGen<T> {
    private Object[] arr;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public MyListGen() {
        arr = new Object[DEFAULT_SIZE];
    }

    void add(T i){
        if(isFull()){
            resize();
        }
        arr[size++] = (T)i;
    }

    private void resize() {
        Object[] temp = new Object[2 * arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    private boolean isFull() {
        return size == arr.length;
    }

    int size(){
        return size;
    }

    T remove(){
        return (T) arr[--size];
    }

    public String toString(){
        return "My List is [" + Arrays.toString(arr) + "]";
    }
}

public class MyArrayList {
    public static void main(String[] args) {
        MyList l1 = new MyList();
        for(int i = 1; i < 13 ; i++){
            l1.add(i);
        }

        System.out.println(l1);

        MyListGen<String> l2 = new MyListGen<>();
        l2.add("Tejas");
        System.out.println(l2);

        MyListGen<Integer> l3 = new MyListGen<>();
        l3.add(45);
        System.out.println(l3);
    }


}
