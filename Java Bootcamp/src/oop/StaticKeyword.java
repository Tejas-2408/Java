package oop;

import java.sql.SQLOutput;

class Test1{
    static String name;

    Test1(String name){
        Test1.name = name;
    }
}

public class StaticKeyword {
    static int a = 4;
    static int b;
    static {
        System.out.println("I am inside static block");
        System.out.println("This block will run only once when the class is loaded");
        b = a * 5;
    }

    class Test2{
        String name;
        Test2(String name){
            this.name = name;
        }
    }

    static class Test3{
        String name;
        Test3(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
        System.out.println(a+"    "+b);
        b += 5;
        System.out.println(a+"   "+b);
        StaticKeyword newObj = new StaticKeyword();
        System.out.println(a+"   "+b);  // the static block will not execute again
        System.out.println("Static block action is over");

        Test1 a = new Test1("Tejas");
        System.out.println(a.name);
        Test1 b = new Test1("Ravi");
        System.out.println(a.name);
        System.out.println(b.name);

//        Test2 c = new Test2("Tejas2");  this will throw error
        Test3 d = new Test3("Tejas3");
        System.out.println(d.name);
        Test3 e = new Test3("Ravi3");
        System.out.println(d.name);
        System.out.println(e.name);
    }
}
