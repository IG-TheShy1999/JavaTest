package innerDemo.innerDemo1;

public class test {
    public static void main(String[] args) {
        outer.inner oi = new outer().new inner();
        oi.show();
    }
}
