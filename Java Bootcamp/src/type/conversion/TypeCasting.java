package type.conversion;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        float num = sc.nextFloat();

        // Rules for type automatic conversion
        // 1. Two literals should be compatible
        // 2. Destination data type should be greater than source data type

//        System.out.println(num);

        // Type casting is converting literal to smaller data type
        int c = (int)34.56;
        System.out.println(c);

        // automatic type promotion
//        int a = 257;
//        byte b = (byte)(a);  // 257%256 = 1
//        System.out.println(b);

        byte x = 40, y = 50, z= 100;

        int m = x*y/z;
        // a*b = 2000 exceeds the byte limit but java handles it as byte

        System.out.println(m);

//        byte t = 50;
//        t = t*2;  will throw error as type conversion not done explicitly

        int n = 'A';
        System.out.println(n);
    }
}
