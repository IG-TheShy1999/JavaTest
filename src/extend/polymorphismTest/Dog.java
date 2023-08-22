package extend.polymorphismTest;

public class Dog extends Animal {
  public Dog() {
  }

  public Dog(int age, String color) {
    super(age, color);
  }

  @Override
  public void eat(String sth) {
    System.out.println(this.getAge()+"岁的"+ this.getColor()+"颜色的狗"+sth);
  }

  public void lookHome(){
    System.out.println("look home");
  }
}
