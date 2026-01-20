package string;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String s = "abc";
//        permutations("",s);
        System.out.println(permutationList("",s));
//        System.out.println(countPermutation("",s));
    }

    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i = 0; i <= p.length(); i++){
            String s = p.substring(0,i);
            String e = p.substring(i,p.length());
            permutations(s+ch+e,up.substring(1));
        }
    }

    static ArrayList<String> permutationList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ls = new ArrayList<>();
            ls.add(p);
            return ls;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for(int i = 0; i <= p.length(); i++){
            String s = p.substring(0,i);
            String e = p.substring(i,p.length());
            ans.addAll(permutationList(s+ch+e,up.substring(1)));
        }

        return ans;
    }

    static int countPermutation(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;
        for(int i = 0; i <= p.length(); i++){
            String s = p.substring(0,i);
            String e = p.substring(i,p.length());
           count = count + countPermutation(s+ch+e,up.substring(1));
        }

        return count;
    }
}
