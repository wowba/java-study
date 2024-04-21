package java_basic.operator;

public class OperatorEx1 {
    public static void main(String[] args) {
        // 문제 1번
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        int average = sum / 3;
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);

        // 문제 2번
        double var1 = 1.5;
        double var2 = 2.5;
        double var3 = 3.5;

        double sum1 = var1 + var2 + var3;
        System.out.println(sum1);
        System.out.println(sum1 / 3);

        // 문제 3번
        int score = 90;
        if (score >= 80 && score <= 100) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
