package interfacedemo.a02interfacedemo2;

public abstract class athlete extends person {
    public athlete() {
    }

    public athlete(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}
