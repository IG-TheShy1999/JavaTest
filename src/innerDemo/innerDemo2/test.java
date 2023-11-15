package innerDemo.innerDemo2;

public class test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer.Inner();
        oi.show1();

        Outer.Inner.show2();
    }
}
