package extend.a08oopextensdemo8;

public class Test {
  public static void main(String[] args) {
    Employee m = new Manager(1,"Yazawa Nico",400000,100000);
    Employee c = new Cook(2,"Nishikino Maki",100000);


    ((Cook) c).drink();
  }
  public static void register(Employee e){
    e.work();
  }
}
