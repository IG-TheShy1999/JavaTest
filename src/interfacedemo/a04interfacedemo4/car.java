package interfacedemo.a04interfacedemo4;

public class car {
    String brand;
    int age;
    String color;

    static class generator {
        String brand;
        int limitAge;

        generator(String brand, int limitAge) {
            this.brand = brand;
            this.limitAge = limitAge;
        }
    }

    public static void main(String[] args) {
        generator g = new generator("BMW", 30);
        System.out.println(g.brand);
    }
}
