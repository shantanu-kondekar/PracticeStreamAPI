package com.upgrad.practice;

public class Test {
    String name = "Hello";

    public static void main(String args[]) {
        try {
            Test obj = Test.class.newInstance();
            System.out.println(obj.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
