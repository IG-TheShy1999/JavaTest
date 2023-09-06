package interfacedemo.a01interfacedemo1;

public class dog extends animal implements swim{
    public dog() {
    }

    public dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("eat bone");
    }

    @Override
    public void swim() {
        System.out.println("goupao");
    }
}
