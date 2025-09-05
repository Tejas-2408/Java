package functions.method;

import java.util.Scanner;

public class Arguments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        greet(name);
        String message = greet2(name);
        System.out.println(message);
        change(name);
        System.out.println(name);
    }

    static String greet2(String name) {
        return "How are you? "+name;
    }

    static void greet(String name) {
        System.out.println("Hello "+ name);
    }

    static void change(String name){
        name = "bansal";
        System.out.println("Function change output "+name);
    }
}
