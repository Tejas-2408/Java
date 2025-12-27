package recursion;

public class StringRecursion {
    public static void main(String[] args) {
        String s = "bacaccad";
        System.out.println(removeAArgument(s,0,""));
        System.out.println(removeANewString(s,0));
        skipA("",s);
        System.out.println(skipApple("dfgappleqza"));
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

    static void skipA(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if(ch == 'a'){
            skipA(p,up.substring(1));
        }
        else{
            skipA(p+ch,up.substring(1));
        }
    }

    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else{
            return ch + skipApple(up.substring(1));
        }
    }
}
