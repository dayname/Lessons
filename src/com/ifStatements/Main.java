package com.ifStatements;

public class Main {
    public static void main(String[] args) {
        byte temp = 32;
        if (temp > 30)
        {
            System.out.println("It's a hot day");
            System.out.println("I want to drink water");
        }
        else if (temp > 20 && temp <= 30)
            System.out.println("Nice day");
        else
            System.out.println("Cold day");
        //Simplifying if statements
        int income = 120000;
        boolean hasHighIncome = (income > 100000);
        // The ternary operator
        String className = (income > 100000 ? "Luxury" : "Economic") ;
        // switch operator
        /*String name = "admin";
        switch (name) {
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
                break;
        }
        */
        }
    }


