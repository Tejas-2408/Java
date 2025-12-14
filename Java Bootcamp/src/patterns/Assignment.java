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
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        // Pattern 5
//        for(int i=0;i<2*n;i++){
//            int totalStars = i<n?i:(2*n)-i;
//            for(int j=0;j<totalStars;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Pattern 6
//        for(int i=0;i<n;i++){
//            int totalSpaces = n-i-1;
//            for(int j=0;j<totalSpaces;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Pattern 7
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//
//            for(int j=0;j<n-i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // pattern 8
//        for(int i=1;i<=n;i++){
//            int totalSpaces = n-i;
//            for(int j=0;j<totalSpaces;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<2*i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Pattern 9
//        for(int i=n;i>0;i--){
//            int totalSpaces = n-i;
//            for(int j=0;j<totalSpaces;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<2*i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Pattern 10
//        for(int i=1;i<=n;i++){
//            int totalSpaces = n-i;
//            for(int j=0;j<totalSpaces;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Pattern 11
//        for(int i=n;i>0;i--){
//            int totalSpaces = n-i;
//            for(int j=0;j<totalSpaces;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Pattern 12
//        for(int i=0;i<2*n;i++){
//            int totalSpaces = i<n?i:(2*n)-i-1;
//            int totalStars = i<n?n-i:i-n+1;
//
//            for(int j=0;j<totalSpaces;j++){
//                System.out.print(" ");
//            }
//
//            for(int j=0;j<totalStars;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Pattern 13
//        for(int i=1;i<=n;i++){
//            for(int j=0;j<n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<2*i;j++){
//                if(j==1 || j==(2*i)-1 || i==n){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        // Pattern 14
//        for(int i=n;i>0;i--){
//            for(int j=0;j<n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<2*i;j++){
//                if(j==1 || j==(2*i)-1 || i==n){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        // pattern 15
        for(int i=1;i<=2*n;i++){
            int outTotalSpaces = i<=n?n-i:i-n;
            for(int j=0;j<outTotalSpaces;j++){
                System.out.print(" ");
            }

            if(i<=n){
                for(int j=1;j<2*i;j++){
                    if(j==1 || j==2*i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            else{
                for(int j=1;j<=n-outTotalSpaces;j++){
                    if(j==1 || j==n-outTotalSpaces){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
