package extend.polymorphismTest;

public class Person {
  String name;
  int age;

  public Person() {
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void keepPet(Animal a,String sth){
    if(a instanceof Dog){
      System.out.println("年龄为"+this.getAge()+"岁的"+this.getName()+"养了一只"+a.getColor()+"颜色的"+a.getAge()+"岁的狗");
      a.eat(sth);
      ((Dog) a).lookHome();
    }else if(a instanceof Cat){
      System.out.println("年龄为"+this.getAge()+"岁的"+this.getName()+"养了一只"+a.getColor()+"颜色的"+a.getAge()+"岁的猫");
      a.eat(sth);
      ((Cat) a).catchMouse();
    }
  }
}
