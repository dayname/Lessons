package com.logicalOperators;

public class Main {
    public static void main(String[] args) {
        byte temperature = 11;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        boolean hasMoney = true;
        boolean hasBogatiyBatya = true;
        boolean hasPoorFriends = false;
        boolean isMajor = (hasBogatiyBatya || hasMoney) && !hasPoorFriends; // ! not operator
        System.out.println(isMajor);

    }
}
