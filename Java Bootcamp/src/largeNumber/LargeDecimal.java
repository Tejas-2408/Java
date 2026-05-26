package largeNumber;

// BigDecimal gives the exact answers rather than double/float because double/float are floating no. meaning they are binary representation of a exponent of a value but BigDecimal is exact value

import java.math.BigDecimal;

public class LargeDecimal {
    public static void main(String[] args) {
        BigDecimal a = BigDecimal.valueOf(23.578);
        System.out.println(a);
        BigDecimal b = new BigDecimal("0.03");
        BigDecimal c = new BigDecimal("0.04");
        BigDecimal ans = c.subtract(b);
        System.out.println(ans);

        double x = 0.03;
        double y = 0.04;
        System.out.println(y-x);
    }
}
