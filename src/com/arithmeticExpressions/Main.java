package com.arithmeticExpressions;

public class Main {
    public static void main(String[] args) {
        int sum = 1000 + 4;
        double div = (double)10 / (double)3;
        //System.out.println(div);
        int n = 1;
        n++;
        //System.out.println(n);
        int x = 1;
        //int y = x++;
        int y = ++x;
        System.out.println(x);
        System.out.println(y);
        x += 4; // x -= 4; x /= 4; x *= 4;
        System.out.println(x);



    }
}
