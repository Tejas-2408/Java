package oop.abstractDemo;

import java.sql.SQLOutput;

public class Son extends Parent{
    @Override
    void career(String name) {
        System.out.println("Son is " + name);
    }

    @Override
    void partner(String name) {
        System.out.println("Son love" + name);
    }
}
