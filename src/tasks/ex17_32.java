package tasks;

import java.util.Scanner;

public class ex17_32 {
    public static void main(String[] args) {
        int x;
        byte d;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        d = scanner.nextByte();
        System.out.println(contain(x, d));
    }
    public static boolean contain(int x, byte d){
        boolean checker = false;
        while(x > 0 & !checker){
            checker = (x % 10 == d);
            x = x / 10;
        }
        return checker;
    }
}
