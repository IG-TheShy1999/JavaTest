package com.test.a05objectsdemo;

import java.util.Objects;

public class ObjectsDemo1 {
    public static void main(String[] args) {
        Student s1 = null;
        Student s2 = new Student("ecy", 17);

        boolean result = Objects.equals(s1, s2);

        System.out.println(result);


    }
}
