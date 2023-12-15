package com.test.a02systemdemo;

import java.io.IOException;

public class a02systemdemo {
    public static void main(String[] args) throws IOException {
//        Runtime.getRuntime().exec("shutdown -s -t 3600");
        Runtime.getRuntime().exec("shutdown -a");
    }
}
