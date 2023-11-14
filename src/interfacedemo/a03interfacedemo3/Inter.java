package interfacedemo.a03interfacedemo3;

public interface Inter {
    public abstract void eat();

    public default void drink() {
        System.out.println("drink some thing");
    }

    ;
}
