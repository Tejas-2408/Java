package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListsExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        System.out.println(al);

        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr.add(sc.nextInt());
        }

        for(int i=0;i<5;i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
