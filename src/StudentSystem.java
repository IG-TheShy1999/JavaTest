import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
  public static void main(String[] args) {
    ArrayList<Student> list = new ArrayList<>();
    loop: while (true) {
      System.out.println("----------Welcome to Futian High School----------");
      System.out.println("1: Create Student");
      System.out.println("2: Delete Student");
      System.out.println("3: Set Student");
      System.out.println("4: Search Student");
      System.out.println("5: Exit");
      System.out.println("Please enter your choice:");
      Scanner sc = new Scanner(System.in);
      String choose = sc.next();
      switch (choose) {
        case "1" ->addStudent(list);
        case "2" ->deleteStudent(list);
        case "3" ->updateStudent(list);
        case "4" ->queryStudent(list);
        case "5" ->{
          System.out.println("Exit");
//          break loop;
          System.exit(0);
        }
        default->System.out.println("Undefined");
      }
    }
  }

  public static void addStudent(ArrayList<Student> list) {
    Student s = new Student();
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("请输入学生的id");
      int id = sc.nextInt();
      boolean flag = contains(list,id);
      if (flag){
        System.out.println("id已存在");
      }else {
        s.setId(id);
        break;
      }
    }

    System.out.println("请输入学生的name");
    String name = sc.next();
    s.setName(name);

    System.out.println("请输入学生的age");
    int age = sc.nextInt();
    s.setAge(age);

    System.out.println("请输入学生的address");
    String address = sc.next();
    s.setAddress(address);

    list.add(s);
  }
  public static void deleteStudent(ArrayList<Student> list) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入想要删除的id");
    int id = sc.nextInt();
    for (int i = 0; i < list.size(); i++) {
      Student stu = list.get(i);
      if (stu.getId()==id){
        list.remove(i);
        System.out.println("删除成功");
        return;
      }
    }
    System.out.println("没有找到这个id");
  }
  public static void updateStudent(ArrayList<Student> list) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入想要修改的id");
    int id = sc.nextInt();

    for (int i = 0; i < list.size(); i++) {
      Student stu = list.get(i);
      if (stu.getId()==id){
        System.out.println("请输入要修改的名字");
        String newName = sc.next();
        stu.setName(newName);
        System.out.println("请输入要修改的年龄");
        int newAge = sc.nextInt();
        stu.setAge(newAge);
        System.out.println("请输入要修改的地址");
        String newAddress = sc.next();
        stu.setAddress(newAddress);
        return;
      }
    }
    System.out.println("没有找到这个id");
  }
  public static void queryStudent(ArrayList<Student> list) {
    if (list.size()==0){
      System.out.println("当前无学生信息");
    }else {
      for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i).getId()+" "+list.get(i).getName()+" "+list.get(i).getAge()+" "+list.get(i).getAddress());
      }
    }
  }

//  判断id是否存在
  public static boolean contains(ArrayList<Student> list,int id){
    for (int i = 0; i < list.size(); i++) {
      Student stu = list.get(i);
      int stuId = stu.getId();
      if (stuId == id) {
        return true;
      }
    }
    return false;
  }

}
