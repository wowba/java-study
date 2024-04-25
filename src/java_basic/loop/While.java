package java_basic.loop;

public class While {
    public static void main(String[] args) {
        int count = 0;

        while (count < 10) {
            count += 1;
            System.out.println(count);
        }

        int answer = 1;
        int sum = 1;
        while (sum < 4) {
            answer = answer + sum;
            sum = sum + 1;
            System.out.println(answer);
        }

        do { // 최초 한번은 실행된다.
            System.out.println("do");
        } while (false);

        while (true) {
            System.out.println("before break");
            break;
            // System.out.println("after break");
        }

        int i = 1;
        while (i < 4) {
            if (i < 3) {
                i = i + 1;
                continue;
            }
            System.out.println("i!!!!");
            break;
        }
    }
}
