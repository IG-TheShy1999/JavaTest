package com.test.a01staticdemo1;

public class StudentTest {
  public static void main(String[] args) {
    Student stu1 = new Student("nico",18,"girl");
    Student stu2 = new Student("kotori",17,"girl");

    stu1.study();
    stu2.show();
  }
}
