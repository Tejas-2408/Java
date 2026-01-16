package oop.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son s = new Son();
        Daughter d = new Daughter();
        s.career("coder");
        d.career("chef");
        s.partner("iron man");
        d.partner("bf");

        Parent p = new Son();
        p.career("Teacher");
    }
}
