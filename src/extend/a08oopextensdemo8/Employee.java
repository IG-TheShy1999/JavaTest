package extend.a08oopextensdemo8;

public class Employee {
  int id ;
  String name;
  int salary;

  public Employee() {
  }

  public Employee(int id, String name, int salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public void work(){
    System.out.println("work");
  }

  public void eat(){
    System.out.println("eat rice");
  }

}
