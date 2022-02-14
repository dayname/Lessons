package tasks;

import java.util.Scanner;

public class ex11_29 {
    public static void main(String[] args) {
        int n, n1;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        n1 = n % 10;
        for (int i = 100 + n1; i < 990 + 4; i+=10){
                System.out.print(i + " ");
        }



    }
}
