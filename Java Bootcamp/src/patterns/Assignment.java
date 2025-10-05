package patterns;

// https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

public class Assignment {
    public static void main(String[] args) {
        int n = 5;
        // Pattern 1:
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Pattern 2
//        for(int i=1;i<=n;i++){
//            for(int j=0;j<i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Pattern 3
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Pattern 4
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
