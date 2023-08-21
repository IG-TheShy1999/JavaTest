package extend.a02oopextensdemo2;

public class Test {
  public static void main(String[] args) {
    Zi zi = new Zi();
    zi.lunch();
  }


}

class Fu {
  public void eat() {
    System.out.println("eat");
  }

  public void drink() {
    System.out.println("drink");
  }
}

class Zi extends Fu {
  @Override
  public void drink() {
    System.out.println("drink water");
  }


  public void lunch() {
    super.eat();
    super.drink();
    this.drink();
  }


}
