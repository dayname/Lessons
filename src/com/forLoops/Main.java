package com.forLoops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
            System.out.println("Hello world " + i);
        // While
        int i = 0;
        while (i > 0) {
            System.out.println("Hello world " + i);
            i++;
        }
        // Some examples with while
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input " + i + ":");
            input = scanner.next().toLowerCase();
            System.out.println(input);
            i++;
        }
        // do while loops (same thing but this loops will executed at least 1 time)
        do {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));
        // break and continue
        String Input = "";
        while (true) {
            System.out.print("Input " + i + ":");
            Input = scanner.next().toLowerCase();
            if (!Input.equals("pass"))
                continue;
            if (!Input.equals("quit"))
                break;
            System.out.println(Input);
            i++;
        }
        // for each loop
        String[] fruits = {"Apple", "Mango", "Orange"};

        for(int j = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);

        for (String fruit : fruits)
            System.out.println(fruit);

    }
}
