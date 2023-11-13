package interfacedemo.a02interfacedemo2;

public abstract class teacher extends person {
    public teacher() {
    }

    public teacher(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
