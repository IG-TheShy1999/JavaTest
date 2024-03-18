package com.test.a08regexdemo;

public class RegexDemo1 {
    public static void main(String[] args) {
        String qq = "123456789";
        System.out.println(check(qq));
    }

    public static boolean check(String qq) {
        int len = qq.length();
        if (len < 6 || len > 20) {
            return false;
        }
        if (qq.startsWith("0")) {
            return false;
        }
        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }


        return true;
    }
}
