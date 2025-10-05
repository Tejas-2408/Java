package patterns;

public class Square {
    public static void main(String[] args) {
        starSquare(4);
    }

    public static void starSquare(int n){
        for(int i=1; i<=n; i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
