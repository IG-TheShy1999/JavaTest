package com.test.a03staticdemo3;

import java.util.ArrayList;

public class Test {
  public static void main(String[] args) {
    ArrayList<Student> list = new ArrayList<>();

    Student stu1 = new Student("maki",16,"girl");
    Student stu2 = new Student("kotori",17,"girl");
    Student stu3 = new Student("nico",18,"girl");


    list.add(stu1);
    list.add(stu2);
    list.add(stu3);

    System.out.println(StudentUtil.getMaxAge(list));
  }
}
