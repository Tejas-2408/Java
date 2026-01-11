package oop.access.control;

public class SubClass extends TestClass {
    public SubClass(int num, String name, int salary, int age) {
        super(num, name, salary, age);
    }

    public static void main(String[] args) {
        SubClass sc = new SubClass(24,"Tejas",50000,24);
//        int n = sc.num; // throw error because was private
        int n = sc.getNum();

        String naam1 = sc.name; // protected variables can be accessed in subClasses
        String naam2 = sc.getName();

        int salary = sc.salary; // public variables can be accessed anywhere

        int age = sc.age; // within same package non-specified modifiers can be accessed


    }
}
