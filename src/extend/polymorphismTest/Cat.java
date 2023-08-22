package extend.polymorphismTest;

public class Cat extends Animal {
  public Cat() {
  }

  public Cat(int age, String color) {
    super(age, color);
  }

  public void catchMouse(){
    System.out.println("catch mouse");
  }
  @Override
  public void eat(String sth) {
    System.out.println(this.getAge()+"岁的"+ this.getColor()+"颜色的猫"+sth);
  }
}
