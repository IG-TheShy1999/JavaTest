package com.test.a04bigdecimaldemo;

import java.math.BigDecimal;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal(10.0);
        BigDecimal bd2 = new BigDecimal(2.0);
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);

        BigDecimal bd4 = bd1.subtract(bd2);
        System.out.println(bd4);
    }
}
