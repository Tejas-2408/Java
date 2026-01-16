package oop.abstractDemo;

public class Daughter extends Parent{
    @Override
    void career(String name) {
        System.out.println("Daughter is  " + name);
    }

    @Override
    void partner(String name) {
        System.out.println("daughter loves "+ name);
    }
}
