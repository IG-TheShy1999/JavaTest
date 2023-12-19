package test;

public class test7 {
    public static void main(String[] args) {
        String str = "123456789";

        int num = 0;
        if (!str.matches("[1,9]\\d{0,9}")) {
            System.out.println("wrong input");
        } else {
            for (int i = 0; i < str.length(); i++) {
                int tick = str.charAt(i) - '0';
                num = num * 10 + tick;
            }
        }
        System.out.println(num);
    }
}
