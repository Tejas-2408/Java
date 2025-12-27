package string;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubSets {
    public static void main(String[] args) {
        String s = "abc";
        printSubsets("",s);
        System.out.println(subSeq("",s));
    }

    static void printSubsets(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        printSubsets(p+ch,up.substring(1));
        printSubsets(p,up.substring(1));
    }

    static ArrayList<String> subSeq(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ls = new ArrayList<>();
            ls.add(p);
            return ls;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subSeq(p+ch,up.substring(1));
        ArrayList<String> right = subSeq(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
