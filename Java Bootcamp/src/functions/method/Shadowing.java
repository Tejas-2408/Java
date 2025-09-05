package functions.method;

public class Shadowing {
    // shadowing means defining variables of same name where the scope overlaps, the local defination will take precendence
    static int x = 100;  // shadowing is done on line 7
    public static void main(String[] args) {
        System.out.println(x);
        int x = 20;
        System.out.println(x);
        func();
    }

    static void func(){
        System.out.println(x);
    }
}
