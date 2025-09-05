package functions.method;

public class Overloading {
    // Defining functions with same name but either
    // 1. The arguments are of different types or
    // 2. If same type of arguments used then variables should be different
    public static void main(String[] args) {
        func(1);
        func("tejas");
        func(1,2);
    }

    static void func(int a){
        System.out.println(a);
    }

    static void func(String a){
        System.out.println(a);
    }

    static void func(int a, int b){
        System.out.println(a+b);
    }

}
