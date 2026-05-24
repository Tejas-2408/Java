package string.buffer;

public class LargeString {
    public static void main(String[] args) {

        // constructor 1
        StringBuffer sb = new StringBuffer();
        // sb is mutable sequence of characters

        // Advantages
        /*
        1. Mutable
        2. Efficient
        3. Thread safe -> therefore slower [StringBuilder is not thread safe]
         */
        sb.append("IamaVibeCoder");

        // constructor 2
        StringBuffer sb2 = new StringBuffer("Tejas Bansal");

        // constructor 3
        StringBuffer sb3 = new StringBuffer(30);

        sb.append("TheBest");

//        sb.insert(3," ");
        sb.replace(1,4, " am a ");
        sb.delete(5,6);
        sb.reverse();
        String str = sb.toString();
        System.out.println(str);
    }
}
