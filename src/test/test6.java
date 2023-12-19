package test;

import java.util.ArrayList;
import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.print("输入一个整数：");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);

            if (num > 100 || num < 1) {
                System.out.println("wrong input!");
                continue;
            }

            list.add(num);
            sum = getSum(list);
            System.out.println(sum);
            if (sum > 50) {
                System.out.println(list);
                break;
            }
        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
