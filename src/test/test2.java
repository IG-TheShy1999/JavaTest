package test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        System.out.println("please enter a num between 1 and 7");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        String weekday = " ";
/*        switch (num) {
            case 1 ->weekday = "S1";
            case 2 ->weekday = "S2";
            case 3 ->weekday = "S3";
            case 4 ->weekday = "S4";
            case 5 ->weekday = "S5";
            case 6 ->weekday = "S6";
            case 7 ->weekday = "S7";
            default ->System.out.println("enter fail");

        }*/
        System.out.println("today is " + weekday);
    }
}
