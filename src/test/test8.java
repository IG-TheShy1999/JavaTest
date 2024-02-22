package test;

import java.util.ArrayList;

public class test8 {
    public static void main(String[] args) {
        int num = 1234567;
        toTwo(num);
    }

    private static void toTwo(int num) {
        ArrayList list = new ArrayList<>();
        String count = "";
        while (num != 0) {
            int yu = num % 2;
            count = yu + count;
            num = num / 2;

//            System.out.println(num);
        }
//        for (int i = list.size() - 1; i > 0; i--) {
//            count += list.get(i).toString();
//        }
        System.out.println(count);
    }
}
