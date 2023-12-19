package test;

import java.util.ArrayList;

public class test8 {
    public static void main(String[] args) {
        int num = 1234567;
        toTwo(num);
    }

    private static void toTwo(int num) {
        ArrayList list = new ArrayList<>();
        while (true) {

            int yu = num % 2;
            list.add(yu);
            num = num / 2;
            if (num == 0) {
                break;
            }
//            System.out.println(num);
        }
        String count = "";
        for (int i = list.size() - 1; i > 0; i--) {
            count += list.get(i).toString();
        }
        System.out.println(count);
    }
}
