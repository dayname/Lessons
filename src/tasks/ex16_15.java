package tasks;

public class ex16_15 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++){
            int s = 0;
            for (int j = 2; j < i; j++){
                if (i % j == 0)
                    s += 1;
            }
            if (s == 0)
                System.out.print(i + " ");
        }
    }
}
