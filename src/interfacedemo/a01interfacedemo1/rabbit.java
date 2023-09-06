package interfacedemo.a01interfacedemo1;

public class rabbit extends animal{
    public rabbit() {
    }

    public rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("eat hlb");
    }
}
