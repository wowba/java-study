package java_basic.class_and_obj;

public class ClassAndObjEx {
    public static void main(String[] args) {
        // 클래스를 사용하지 않으면 아래처럼 각 객체를 풀어서 변수에 할당해야 한다.
        // 클래스를 사용하는 것에 비해 코드가 길어지고 비효율적이다.

        String st1Name = "학생1";
        int st1Age = 18;
        int st1Score = 90;

        String st2Name = "학생2";
        int st2Age = 20;
        int st2Score = 80;

        print(st1Name, st1Age, st1Score);
        print(st2Name, st2Age, st2Score);

        String[] names = {
            "학생3", "학생4"
        };
        int[] ages = {
            16, 17
        };
        int[] scores = {
            100, 90
        };

        for (int i = 0; i < names.length; i++) {
            print(names[i], ages[i], scores[i]);
        }

    }
    // 변수로 관리할 때는 메서드를 이용할 수 있다.
    public static void print(String name, int age, int score) {
        System.out.println("이름 : " + name + " 나이 : " + age + " 성적 : " + score);
    }
}
