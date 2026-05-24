package string.buffer;

import java.text.DecimalFormat;
import java.util.Arrays;

public class RemovingWhiteSpaces {
    public static void main(String[] args) {
        String sentence = " hey . How are    you?  ";
        System.out.println(sentence.replace("\s",""));

        // Split
        String arr = "tejas ravi saurabh";
        String[] names = arr.split(" ");
        System.out.println(Arrays.toString(names));

        // rounding off
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(2.4));
        System.out.println(df.format(2.345674));
        System.out.println(df.format(2.445600));

    }
}
