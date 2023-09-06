package interfacedemo.a01interfacedemo1;

public class frog extends animal implements swim{
    public frog() {
    }

    public frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("eat ant");
    }

    @Override
    public void swim() {
        System.out.println("wayong");
    }
}
