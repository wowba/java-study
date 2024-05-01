package java_basic.class_and_obj;

public class ClassAndObj {
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

        // 아래는 Student 클래스를 사용해 인스턴스를 만드는 예제
        // 클래스를 사용하면 사용자가 정의한 타입처럼 사용할 수 있다.
        Student student1 = new Student(); // Student 타입을 받는 변수 선언 및 new 키워드를 이용한 Student 인스턴스 생성
        student1.name = "학생1"; // 점을 이용해서 객체의 속성에 접근해 값을 할당할 수 있다. 값을 읽을때도 동일하다.
        student1.age = 15;
        student1.score = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 19;
        student2.score = 80;

        // 아래처럼 새로운 배열에 기존의 인스턴스를 넣게되면
        // 인스턴스가 복제되는 것이 아닌, 인스턴스가 반환하는 객체의 주솟값이 배열 내에 저장된다.
        // 따라서 배열 내 인스턴스는 새로 복사된 것이 아닌 기존 인스턴스의 주솟값을 가지는 것이다.
        // 중요! -> 자바에서 대입은 해당 변수에 들어있는 값을 복사해서 전달한다.
        Student[] students = {student1, student2};
        for (Student student : students) {
            print(student.name, student.age, student.score);
        }
    }
    // 변수로 관리할 때는 메서드를 이용할 수 있다.
    public static void print(String name, int age, int score) {
        System.out.println("이름 : " + name + " 나이 : " + age + " 성적 : " + score);
    }
}
