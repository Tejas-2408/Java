package patterns;

import java.util.Scanner;

// Approach
/*
1. Run the Outer loop number of times rows/lines are required
2. Identify the number of columns for each row
3. Print what is required
 */


public class Triangles {
    public static void main(String[] args) {
//        rightAngleTriangle(4);
//        invertedRightAngle(5);
//        numberRightAngle(5);
        rotatedTriangle(5);
//        numberTriangle(5);
    }

    // Right Angle Triangle
/*
    *
    * *
    * * *
    * * * *
*/
    public static void rightAngleTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedRightAngle(int n){
        for(int i=1;i<=n; i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numberRightAngle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void rotatedTriangle(int n){
        for(int i=0 ;i<2*n; i++){
            int totalCol = i>n ? 2*n-i : i;
            for(int j=0;j<totalCol;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numberTriangle(int n){
        for(int row=1; row<=n; row++){
            int noofSpace = n-row;
            for(int j=0;j<noofSpace;j++){
                System.out.print("  ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

}
