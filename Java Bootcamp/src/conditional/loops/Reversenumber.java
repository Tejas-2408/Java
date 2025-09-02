package conditional.loops;

import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev_n = 0;

        while(n>0){
            int rem = n%10;
            rev_n = rev_n*10 + rem;
            n = n/10;
        }

        System.out.println(rev_n);

    }
}
