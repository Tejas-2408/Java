package recursion;

public class basicRecursion {
    public static void main(String[] args) {
        revCounting(5);
        counting(5);
    }

    static void revCounting(int n){
        if(n<1){
            return;
        }
        System.out.print(n+" ");
        revCounting(n-1);
    }

    static void counting(int n){
        if(n<1){
            return;
        }
        counting(n-1);
        System.out.print(n+" ");

    }
}
