package functions.method;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class VariableArgs {
    public static void main(String[] args) {
        func(1,2,34,5,6,6,7,7,8,8,89);
        func2(1,2,"tejas","bansal","ravi","kumar");

    }

    static void func(int ...a){
        System.out.println(Arrays.toString(a));
    }

    static void func2(int a, int b, String ...s){
        System.out.println(a+b);
        System.out.println(Arrays.toString(s));
    }
}
