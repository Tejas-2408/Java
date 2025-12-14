package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(findFibbo(6));
    }

    static int findFibbo(int n){
        if(n==1 || n==2){
            return 1;
        }
        return findFibbo(n-1)+findFibbo(n-2);
    }
}
