package extend.polymorphismTest;

public class Test {
  public static void main(String[] args) {
    Person p = new Person("老王",30);
    Animal a = new Dog(2,"黑");

    Person p2 = new Person("老李",20);
    Animal a2 = new Cat(2,"白");

    String sth = "两只前腿死死地抱住骨头猛吃";
    p.keepPet(a,sth);

    p2.keepPet(a2,sth);
  }
}
