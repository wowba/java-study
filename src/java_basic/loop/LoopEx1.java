package java_basic.loop;

public class LoopEx1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i = i + 1;
        }

        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        }

        int a = 2;
        while (a <= 10) {
            System.out.println(a);
            a = a + 2;
        }

        for (int b = 2; b <= 10; b = b + 2) {
            System.out.println(b);
        }

        int max = 5;
        int c = 1;
        int sum = 0;
        while (c <= max) {
            sum = sum + c;
            c++;
        }
        System.out.println(sum);

        sum = 0;
        for (int d = 1; d <= max; d++) {
            sum = sum + d;
        }
        System.out.println(sum);
    }
}
