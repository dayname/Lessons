package tasks;

public class ex {
    public static void main(String[] args) {
        System.out.println(what(8, 3));
    }
        public static int what(int а, int b) {
            while (а != b){
                if (а > b) а = а - b;
                else b = b - а;
            }
        return а;
        }
}