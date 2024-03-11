package com.test.a06bigintegerdemo;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Random r = new Random();


            BigInteger bd1 = new BigInteger(4, r);


            System.out.println(bd1);
        }

    }
}
