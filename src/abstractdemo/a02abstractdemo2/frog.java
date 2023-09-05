package abstractdemo.a02abstractdemo2;

public class frog extends animal{
    public frog() {
    }

    public frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("eat ant");
    }
}
