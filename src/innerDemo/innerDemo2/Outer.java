package innerDemo.innerDemo2;

public class Outer {
    static class Inner {
        public void show1() {
            System.out.println("非静态");
        }

        public static void show2() {
            System.out.println("静态");
        }


    }
}
