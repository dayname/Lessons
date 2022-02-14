package com.mathClass;

public class Main {
    public static void main(String[] args) {
        int result = Math.round(2.3F);
        System.out.println(result);
        int result1 = (int)Math.ceil(2.3F);
        System.out.println(result1);
        //double random = Math.round(Math.random() * 100);
        //int random = (int) Math.round(Math.random() * 100);
        int random = (int) (Math.random() * 100);
        System.out.println(random);
    }
}
