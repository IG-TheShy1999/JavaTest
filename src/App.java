import java.util.Scanner;



public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("欢迎来到学生管理系统");
      System.out.println("请选择：1login 2register 3forgetpassword");
      String choose = sc.next();
      switch (choose){
        case "1" -> login(); 
        case "2" -> register();
        case "3" -> forgetPassword();
        case "4" -> {
          System.exit(0);
        }
        default -> System.out.println("haha");
      }
    }
  }

  private static void login() {
  }

  private static void register() {
  }

  private static void forgetPassword() {
  }

}
