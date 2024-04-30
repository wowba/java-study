package java_start.if_else_switch;

public class IfEx2 {
    public static void main(String[] args) {

        // 1번 문제
        double rating = 7.5;

        if (rating >= 9) {
            System.out.println("어바웃타임");
        }

        if (rating >= 8) {
            System.out.println("토이 스토리");
        }

        if (rating >= 7) {
            System.out.println("고질라");
        }

        // 2번 문제
        String grade = "A";
        switch (grade) {
            case "A" -> System.out.println("very good");
            case "B" -> System.out.println("good");
            case "C" -> System.out.println("not good");
            case "D" -> System.out.println("bad");
            case "E" -> System.out.println("Fail");
            default -> System.out.println("Wrong Grade");
        }

        // 3번 문제
        int a = 10;
        int b = 20;

        int big = a > b ? a : b;
        System.out.println(big);

        // 4번 문재
        int x = 5;
        int mod = x % 2;
        switch (mod) {
            case 0 -> System.out.println("짝수");
            case 1 -> System.out.println("홀수");
        }
    }
}
