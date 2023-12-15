package com.test.a02systemdemo;

public class test {
    public static void main(String[] args) {
        student student = new student("zhangsan", 23);
        student student1 = new student("zhangsan", 23);

        boolean equals = student.equals(student1);
        System.out.println(equals);
    }
}
