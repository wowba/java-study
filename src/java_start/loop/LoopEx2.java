package java_start.loop;

public class LoopEx2 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j );
            }
        }

        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            System.out.println("*".repeat(Math.max(0, i)));
        }
    }
}
