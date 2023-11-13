package interfacedemo.a02interfacedemo2;

public class basketballAthlete extends athlete {
    public basketballAthlete() {
    }

    public basketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("study basketball");
    }
}
