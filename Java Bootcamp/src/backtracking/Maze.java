package backtracking;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(countWays(3,3));
//        printWays(2,2,"");
//        System.out.println(printWaysRet(3,3,""));
        System.out.println(countWaysDia(3,3));
        System.out.println(printWaysDia(3,3,""));
    }

    static int countWays(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int left = countWays(r-1,c);
        int right = countWays(r,c-1);
        return left + right;
    }

    static void printWays(int r, int c, String p){
        if(r == 1 && c == 1){
            ArrayList<String> ls = new ArrayList<>();
            System.out.println(p);
            return;
        }

        if(r>1){
            printWays(r-1,c,p+"D");
        }

        if(c>1){
            printWays(r,c-1,p+"R");
        }
    }

    static ArrayList<String> printWaysRet(int r, int c, String p){
        if(r == 1 && c == 1){
            ArrayList<String> ls = new ArrayList<>();
            ls.add(p);
            return ls;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(r>1){
            ans.addAll(printWaysRet(r-1,c,p+"D"));
        }

        if(c>1){
            ans.addAll(printWaysRet(r,c-1,p+"R"));
        }

        return ans;
    }

    static ArrayList<String> printWaysDia(int r, int c, String p){
        if(r == 1 && c == 1){
            ArrayList<String> ls = new ArrayList<>();
            ls.add(p);
            return ls;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(r > 1 && c > 1){
            ans.addAll(printWaysDia(r-1,c-1,p+"D"));
        }

        if(r>1){
            ans.addAll(printWaysDia(r-1,c,p+"V"));
        }

        if(c>1){
            ans.addAll(printWaysDia(r,c-1,p+"H"));
        }

        return ans;
    }

    static int countWaysDia(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int left = countWaysDia(r-1,c);
        int right = countWaysDia(r,c-1);
        int dia = 0;
        if(r>1 && c>1) {
            dia = countWaysDia(r - 1, c - 1);
        }
        return left + right + dia;
    }
}
