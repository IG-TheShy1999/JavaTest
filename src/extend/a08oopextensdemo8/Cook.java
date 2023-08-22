package extend.a08oopextensdemo8;

public class Cook extends Employee{

  public Cook() {
  }

  public Cook(int id, String name, int salary) {
    super(id, name, salary);
  }

  @Override
  public void work() {
    System.out.println("cook food");
  }

  public void drink(){
    System.out.println("drink");
  }
}
