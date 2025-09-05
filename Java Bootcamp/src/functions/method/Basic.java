package functions.method;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        // Sum two numbers
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt(), b = sc.nextInt();
//
//        System.out.println(a+b);

        sum();
        sum();
    }
    /*
        Function defination
        access_modifier return_type method_name(){
            // body
            return statement
        }
     */

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum is "+ sum);
    }
}
