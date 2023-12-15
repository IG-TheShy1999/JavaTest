package math.a01mathdemo1;

import java.util.Scanner;

public class MathTest1 {
    public static void main(String[] args) {
        isZimi();
    }

    public static void isZimi() {
        for (int i = 2; i < 100000; i++) {
            int n = 0;
            int dai = i;
            int[] wei = new int[999];
            while (dai > 0) {
                wei[n] = i % 10;
                dai = dai / 10;
                n++;
            }


            double total = 0;
            for (int i1 = 0; i1 < wei.length; i1++) {
                total = total + Math.pow(wei[i1], n);
            }
            if (total == i) {
                System.out.println(i);
            }
        }
    }

}
