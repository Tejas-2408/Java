package functions.method;

public class Scope {
    public static void main(String[] args) {
        int a = 10, b = 20;
        swap(a,b);
        System.out.println("Main function value of a is "+a+" and value of b is "+b);

        {
//            int a = 30; // this will give error as a is already defined in main block scope
            a = 90;
            int c = 100;
            System.out.println("c is only accessible here: "+ c);
        }

//        System.out.println("Cannot access c from here "+ c); this is error due to scoping
        System.out.println("value of a is "+ a);

    }

    static void swap(int a, int b){
        int temp = b;
        b = a;
        a = temp;
        // this will only swap the value of variables in this method scope
        System.out.println("Swap function value of a is "+a+" and value of b is "+b);

    }
}
