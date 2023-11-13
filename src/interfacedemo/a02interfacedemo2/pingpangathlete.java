package interfacedemo.a02interfacedemo2;

public class pingpangathlete extends athlete implements speak {

    public pingpangathlete() {
    }

    public pingpangathlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("study pingpang!");
    }

    @Override
    public void speak(String name) {
        System.out.println(name + " is speaking english!");
    }
}
