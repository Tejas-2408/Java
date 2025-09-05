package functions.method;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        // Is prime or not
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println(isPrime(a));

        // Print all three digit armstrong number
        amstrong();
    }

    static void amstrong(){
        for(int i =100;i<1000;i++){
            int n = i;
            int c = 0;
            while(n>0){
                int rem = n%10;
                n/=10;
                c+=(rem*rem*rem);
            }
            if(c==i){
                System.out.println(i);
            }
        }

    }

    static boolean isPrime(int a){
        if(a<=1){
            return false;
        }

        int c = 2;
        while(c*c<=a){
            if(a%c==0){
                return false;
            }
            c++;
        }
        return c*c>a;
    }
}
