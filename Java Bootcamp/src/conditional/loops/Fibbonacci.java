package conditional.loops;

import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        int a=0,b=1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=2;i<=n;i++){
            int temp = b;
            b = b+a;
            a = temp;
        }

        System.out.println(b);



    }
}
