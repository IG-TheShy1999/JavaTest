package interfacedemo.a01interfacedemo1;

public class test {
    public static void main(String[] args) {
        frog f = new frog("wawa", 1);
        System.out.println(f.getName() + "," + f.getAge());

        f.eat();
        f.swim();
    }
}
