package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        // data_type[] variable_name = new data_type[size];
        int[] ros; // declaration // variable is crated in stack
        ros = new int[5]; // initialization // a reference is created in heap memory

        System.out.println(ros[0]);

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 3;

        System.out.println(arr[1]);

        for(int i=0;i<arr.length;i++){
            int a = sc.nextInt();
            arr[i] = a;
        }

        System.out.println(Arrays.toString(arr));
    }
}
