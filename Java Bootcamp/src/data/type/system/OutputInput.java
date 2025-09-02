package data.type.system;

import java.util.Scanner;

public class OutputInput {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(a);  // output

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println(b);

        String s = sc.next();
        System.out.println(s);

        String p = sc.nextLine();
        System.out.println(p);
    }
}
