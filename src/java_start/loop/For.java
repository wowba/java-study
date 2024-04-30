package java_start.loop;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int count = 0;
        for (int i = 1; i < 10; i++) { // i는 for 문 내에서만 사용 가능
            if (count > 10) {
                break;
            }
            count = count + i;
        }
        System.out.println(count);
    }
}
