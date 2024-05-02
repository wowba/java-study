package java_basic.ref;

public class Method {
    public static void main(String[] args) {
        Student a = new Student();
        initStudent(a, "양양", 22, 100);
        Student b = createStudent("영욱", 15, 90);
        System.out.println(b.name);
    }

    static void initStudent(Student student, String name, int age, int score) {
        student.name = name;
        student.age = age;
        student.score = score;
    }

    static Student createStudent(String name, int age, int score) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.score = score;
        return student;
    }
}
