package largeNumber;

import java.math.BigInteger;

public class LargeNumber {
    public static void main(String[] args) {
        int a = 24;

        BigInteger A = BigInteger.valueOf(24);
        BigInteger B = BigInteger.valueOf(2345678);
        int c = B.intValue();
        BigInteger C = new BigInteger("23456789");

        // constants
        BigInteger D = BigInteger.TEN;

        // addition
        BigInteger s = A.add(B);
        System.out.println(s);
    }
}
