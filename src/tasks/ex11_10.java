package tasks;

public class ex11_10 {
    public static void main(String[] args) {
        int n, a = -9, b = 9;
        for (int i = 0; i < 19; i++){
            n = a + (int)(Math.random() * (b - a + 1));
            if (n == 0)
                System.out.print(" % " + n + " % ");
            else
                System.out.print(" " + n + " ");
        }
    }
}
