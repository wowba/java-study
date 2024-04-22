package java_basic.if_else_switch;

public class Switch {
    public static void main(String[] args) {
        int grade = 1;

        switch (grade) {
            case 1:
                System.out.println("grade 1");
            case 2:
                System.out.println("grade 2");
                break; // break가 없다면 다음 문이 바로 실행된다.
                        // break를 사용하면 default 문이 실행되지 않는다.
            default:
                System.out.println("switch over");
        }

        int level = 2;
        switch (level) {
            case 1 -> System.out.println(1);
            case 2 -> System.out.println(2);
            default -> System.out.println(0);
        }
    }
}
