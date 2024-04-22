package java_basic.if_else_switch;

public class IfEx1 {
    public static void main(String[] args) {

        // 1번 문제
        int score = 95;

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        // 2번 문제
        int distance = 1;

        if (distance <= 1) {
            System.out.println("도보");
        } else if (distance <= 10) {
            System.out.println("자전거");
        } else if (distance <= 100) {
            System.out.println("자동차");
        } else {
            System.out.println("비행기");
        }

        // 3번 문제
        int dollar = 1;
        if (dollar < 0) {
            System.out.println("잘못된 금액");
        } else if (dollar > 0) {
            System.out.println("환전 금액은 " + 1400 * dollar + "원 입니다.");
        } else {
            System.out.println("환전할 금액이 없습니다.");
        }
    }
}
