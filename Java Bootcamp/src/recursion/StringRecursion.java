package recursion;

public class StringRecursion {
    public static void main(String[] args) {
        String s = "bacaccad";
        System.out.println(removeAArgument(s,0,""));
        System.out.println(removeANewString(s,0));
    }

    static String removeAArgument(String s, int index, String ans){
        if(index == s.length()){
            return ans;
        }

        if(s.charAt(index) != 'a'){
            ans+=s.charAt(index);
        }

        return removeAArgument(s,index+1,ans);
    }

    static String removeANewString(String s, int index){
        if(index == s.length()){
            return "";
        }

        String ans = s.charAt(index) != 'a' ? s.charAt(index)+"" : "";
        return ans + removeANewString(s,index+1);

    }
}
