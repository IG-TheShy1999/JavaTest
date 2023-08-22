package extend.polymorphismTest;

public class Animal {
  int age;
  String color;

  public Animal() {
  }

  public Animal(int age, String color) {
    this.age = age;
    this.color = color;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
  public void eat(String sth){
    System.out.println("正在吃" + sth);
  }
}
