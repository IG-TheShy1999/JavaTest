package abstractdemo.a02abstractdemo2;

public class sheep extends animal{
    public sheep() {
    }

    public sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("eat grass");
    }
}
