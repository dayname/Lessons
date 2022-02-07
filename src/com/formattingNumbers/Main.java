package com.formattingNumbers;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result1 = currency.format(1234123.44374);
        //System.out.println(result); == 1 234 123,44 ₽
        /*
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.66);
        System.out.println(result2);
    */
        String result2 = NumberFormat.getPercentInstance().format(0.6); // same things
        System.out.println(result2);
    }

}
